package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsData.datasetMod.Dataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/statistics", "computeDatasetStatistics")
  @js.native
  def computeDatasetStatistics(dataset: Dataset[TabularRecord]): js.Promise[DatasetStatistics] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/statistics", "computeDatasetStatistics")
  @js.native
  def computeDatasetStatistics(dataset: Dataset[TabularRecord], sampleSize: js.UndefOr[scala.Nothing], shuffleWindowSize: Double): js.Promise[DatasetStatistics] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/statistics", "computeDatasetStatistics")
  @js.native
  def computeDatasetStatistics(dataset: Dataset[TabularRecord], sampleSize: Double): js.Promise[DatasetStatistics] = js.native
  @JSImport("@tensorflow/tfjs-data/dist/statistics", "computeDatasetStatistics")
  @js.native
  def computeDatasetStatistics(dataset: Dataset[TabularRecord], sampleSize: Double, shuffleWindowSize: Double): js.Promise[DatasetStatistics] = js.native
  
  @JSImport("@tensorflow/tfjs-data/dist/statistics", "scaleTo01")
  @js.native
  def scaleTo01(min: Double, max: Double): js.Function1[/* value */ ElementArray, ElementArray] = js.native
  
  type DatasetStatistics = StringDictionary[NumericColumnStatistics]
  
  type ElementArray = Double | js.Array[Double] | Tensor[Rank] | String
  
  @js.native
  trait NumericColumnStatistics extends StObject {
    
    var length: Double = js.native
    
    var max: Double = js.native
    
    var mean: Double = js.native
    
    var min: Double = js.native
    
    var stddev: Double = js.native
    
    var variance: Double = js.native
  }
  object NumericColumnStatistics {
    
    @scala.inline
    def apply(length: Double, max: Double, mean: Double, min: Double, stddev: Double, variance: Double): NumericColumnStatistics = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericColumnStatistics]
    }
    
    @scala.inline
    implicit class NumericColumnStatisticsMutableBuilder[Self <: NumericColumnStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariance(value: Double): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    }
  }
  
  type TabularRecord = StringDictionary[ElementArray]
}
