package typings.tdigest

import typings.tdigest.anon.PartialDigestConfiguratio
import typings.tdigest.tdigestBooleans.`false`
import typings.tdigest.tdigestBooleans.`true`
import typings.tdigest.tdigestStrings.auto
import typings.tdigest.tdigestStrings.cont
import typings.tdigest.tdigestStrings.disc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tdigest", "Digest")
  @js.native
  open class Digest () extends TDigest {
    def this(config: PartialDigestConfiguratio) = this()
    
    /**
      * While in `'auto'` mode, if there are many unique elements, assume
      * they are from a continuous distribution and switch to `'cont'`
      * mode (tdigest behavior). Return `true` on transition from
      * disctete to continuous.
      */
    def check_continuous(): Boolean = js.native
  }
  
  @JSImport("tdigest", "TDigest")
  @js.native
  open class TDigest protected () extends StObject {
    /**
      *
      * @param delta The compression factor, the max fraction of mass that
      * can be owned by one centroid (bigger, up to 1.0, means more
      * compression). `false` switches off `TDigest` behavior and treats
      * the distribution as discrete, with no merging and exact values
      * reported.
      * @param K A size threshold that triggers recompression as the TDigest
      * grows during input. (Set it to 0 to disable automatic recompression)
      * @param CX Specifies how often to update cached cumulative totals used
      * for quantile estimation during ingest (see `_cumulate()`). Set to
      * `0` to use exact quantiles for each new point.
      *
      * @example
      * import { TDigest } from 'tdigest';
      *
      * const x = [];
      * for (let i = 0; i < 100000; i += 1) {
      *     x.push(Math.random() * 10 - 5);
      * };
      * td = new TDigest();
      * td.push(x);
      * td.compress();
      * console.log(td.summary());
      * console.log("median ~ " + td.percentile(0.5));
      */
    def this(delta: Double) = this()
    def this(delta: `false`) = this()
    def this(delta: Double, K: Double) = this()
    def this(delta: `false`, K: Double) = this()
    def this(delta: Double, K: Double, CX: Double) = this()
    def this(delta: Double, K: Unit, CX: Double) = this()
    def this(delta: `false`, K: Double, CX: Double) = this()
    def this(delta: `false`, K: Unit, CX: Double) = this()
    
    /**
      * Find centroids lower and upper such that `lower.mean < x <
      * upper.mean` or `lower.mean === x === upper.mean`. Don't call
      * this for x out of bounds.
      */
    def bound_mean(x: Double): js.Tuple2[FullCentroid, FullCentroid] = js.native
    
    /**
      * Find centroids lower and upper such that `lower.mean_cumn < x <
      * upper.mean_cumn` or `lower.mean_cumn === x === upper.mean_cumn`. Don't call
      * this for cumn out of bounds.
      */
    def bound_mean_cumn(cumn: Double): js.Tuple2[FullCentroid, FullCentroid] = js.native
    
    /**
      * TDigests experience worst case compression (none) when input
      * increases monotonically. Improve on any bad luck by
      * reconsuming digest centroids as if they were weighted points
      * while shuffling their order (and hope for the best).
      */
    def compress(): Unit = js.native
    
    /**
      * Find the centroid closest to x. The assumption of
      * unique means and a unique nearest centroid departs from the
      * paper, see `_digest()`.
      */
    def find_nearest(x: Double): FullCentroid | Null = js.native
    
    def p_rank(xlist: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Return approximate percentile-ranks (0..1) for data value x.
      * or list of x. Calculated according to
      * https://en.wikipedia.org/wiki/Percentile_rank.
      *
      * (Note that in continuous mode, boundary sample values will
      * report half their centroid weight inward from 0/1 as the
      * percentile-rank. X values outside the observed range return
      * 0/1)
      */
    def p_rank(x: Double): Double = js.native
    
    def percentile(plist: js.Array[Double]): js.Array[Double] = js.native
    /**
      * For percentage `p` (0..1), or for each `p` in a list of `ps`, return
      * the smallest data value `q` at which at least `p` percent of the
      * observations <= `q`.
      *
      * For discrete distributions, this selects q using the Nearest
      * Rank Method
      * (https://en.wikipedia.org/wiki/Percentile#The_Nearest_Rank_method)
      * (in scipy, same as percentile(...., interpolation='higher').
      *
      * For continuous distributions, interpolates data values between
      * count-weighted bracketing means.
      */
    def percentile(p: Double): Double = js.native
    
    def push(x: js.Array[Double]): Unit = js.native
    def push(x: js.Array[Double], /** @default 1 */
    n: Double): Unit = js.native
    /**
      * Incorporate value or array of values `x`, having count `n` into the TDigest.
      */
    def push(x: Double): Unit = js.native
    def push(x: Double, /** @default 1 */
    n: Double): Unit = js.native
    
    def push_centroid(c: js.Array[Centroid]): Unit = js.native
    /**
      * Incorporate a centroid or an array of centroids.
      */
    def push_centroid(c: Centroid): Unit = js.native
    
    /**
      * Prepare to digest new points.
      */
    def reset(): Unit = js.native
    
    def size(): Double = js.native
    
    def summary(): String = js.native
    
    /**
      * @return An array of centroids ordered by mean.
      */
    def toArray(): js.Array[Centroid] = js.native
    @JSName("toArray")
    def toArray_false(everything: `false`): js.Array[Centroid] = js.native
    @JSName("toArray")
    def toArray_true(everything: `true`): js.Array[FullCentroid] = js.native
  }
  
  trait Centroid extends StObject {
    
    var mean: Double
    
    var n: Double
  }
  object Centroid {
    
    inline def apply(mean: Double, n: Double): Centroid = {
      val __obj = js.Dynamic.literal(mean = mean.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[Centroid]
    }
    
    extension [Self <: Centroid](x: Self) {
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  trait DigestConfiguration extends StObject {
    
    /** @default 'auto' */
    var mode: disc | cont | auto
    
    /** @default 0.9 */
    var ratio: Double
    
    /** @default 1000 */
    var thresh: Double
  }
  object DigestConfiguration {
    
    inline def apply(mode: disc | cont | auto, ratio: Double, thresh: Double): DigestConfiguration = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], thresh = thresh.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigestConfiguration]
    }
    
    extension [Self <: DigestConfiguration](x: Self) {
      
      inline def setMode(value: disc | cont | auto): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setThresh(value: Double): Self = StObject.set(x, "thresh", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullCentroid
    extends StObject
       with Centroid {
    
    var cumn: Double
    
    var mean_cumn: Double
  }
  object FullCentroid {
    
    inline def apply(cumn: Double, mean: Double, mean_cumn: Double, n: Double): FullCentroid = {
      val __obj = js.Dynamic.literal(cumn = cumn.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], mean_cumn = mean_cumn.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullCentroid]
    }
    
    extension [Self <: FullCentroid](x: Self) {
      
      inline def setCumn(value: Double): Self = StObject.set(x, "cumn", value.asInstanceOf[js.Any])
      
      inline def setMean_cumn(value: Double): Self = StObject.set(x, "mean_cumn", value.asInstanceOf[js.Any])
    }
  }
}
