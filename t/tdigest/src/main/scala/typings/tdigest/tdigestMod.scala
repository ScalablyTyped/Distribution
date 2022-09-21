package typings.tdigest

import typings.tdigest.anon.PartialDigestConfiguratio
import typings.tdigest.tdigestBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tdigestMod {
  
  @JSImport("tdigest/dist/tdigest", "Digest")
  @js.native
  open class Digest ()
    extends typings.tdigest.mod.Digest {
    def this(config: PartialDigestConfiguratio) = this()
  }
  
  @JSImport("tdigest/dist/tdigest", "TDigest")
  @js.native
  open class TDigest protected ()
    extends typings.tdigest.mod.TDigest {
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
  }
}
