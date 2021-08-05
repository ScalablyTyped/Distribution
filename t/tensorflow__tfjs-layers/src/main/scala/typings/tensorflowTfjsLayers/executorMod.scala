package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distTypesMod.Kwargs
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "FeedDict")
  @js.native
  /**
    * Constructor, optionally does copy-construction.
    * @param feeds An Array of `Feed`s, or another `FeedDict`, in which case
    *   copy-construction will be performed.
    */
  class FeedDict () extends StObject {
    def this(feeds: js.Array[Feed]) = this()
    def this(feeds: FeedDict) = this()
    
    /**
      * Add a key-value pair to the FeedDict.
      *
      * @param key The key of the feed.
      * @param value The value of the tensor feed.
      * @param mask The value of the mask feed (optional).
      * @returns This `FeedDict`.
      * @throws ValueError: If the key `SymbolicTensor` already exists in the
      *   `FeedDict`.
      */
    def add(key: SymbolicTensor, value: Tensor[Rank]): FeedDict = js.native
    def add(key: SymbolicTensor, value: Tensor[Rank], mask: Tensor[Rank]): FeedDict = js.native
    
    /**
      * Add a Feed to the FeedDict.
      * @param feed The new `Feed` to add.
      * @returns This `FeedDict`.
      */
    def addFeed(feed: Feed): Unit = js.native
    
    /** Dispose all mask Tensors held by this object. */
    def disposeMasks(): Unit = js.native
    
    def getMask(key: String): Tensor[Rank] = js.native
    /**
      * Get the feed mask for given key.
      * @param key The SymbolicTensor, or its name (as a string), of which the
      *     value is sought.
      * @returns If `key` exists, the corresponding feed mask.
      * @throws ValueError: If `key` does not exist in this `FeedDict`.
      */
    def getMask(key: SymbolicTensor): Tensor[Rank] = js.native
    
    def getValue(key: String): Tensor[Rank] = js.native
    /**
      * Get the feed value for given key.
      * @param key The SymbolicTensor, or its name (as a string), of which the
      *     value is sought.
      * @returns If `key` exists, the corresponding feed value.
      * @throws ValueError: If `key` does not exist in this `FeedDict`.
      */
    def getValue(key: SymbolicTensor): Tensor[Rank] = js.native
    
    /**
      * Probe whether a key already exists in the FeedDict.
      * @param key
      */
    def hasKey(key: SymbolicTensor): Boolean = js.native
    
    /* private */ var id2Mask: js.Any = js.native
    
    /* private */ var id2Value: js.Any = js.native
    
    /* private */ var name2Id: js.Any = js.native
    
    /**
      * Get all the SymbolicTensor available in this FeedDict.
      */
    def names(): js.Array[String] = js.native
  }
  
  inline def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Unit, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any], kwargs.asInstanceOf[js.Any], probe.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any], kwargs.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any], kwargs.asInstanceOf[js.Any], probe.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: SymbolicTensor, feedDict: FeedDict): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Unit, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any], kwargs.asInstanceOf[js.Any], probe.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any], kwargs.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  inline def execute(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(fetches.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any], kwargs.asInstanceOf[js.Any], probe.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]])]
  
  inline def getTopologicalSortAndRecipientCountsForOneFetch(fetch: SymbolicTensor, feedDict: FeedDict): typings.tensorflowTfjsLayers.anon.RecipientMap = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopologicalSortAndRecipientCountsForOneFetch")(fetch.asInstanceOf[js.Any], feedDict.asInstanceOf[js.Any])).asInstanceOf[typings.tensorflowTfjsLayers.anon.RecipientMap]
  
  trait ExecutionProbe extends StObject {
    
    /**
      * Maximum number of tensors that exist during all steps of the
      * execution. Tensor counts are measured at the beginning of every
      * step.
      */
    var maxNumTensors: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum number of tensors that exist during all steps of the
      * execution. Tensor counts are measured at the beginning of every
      * step.
      */
    var minNumTensors: js.UndefOr[Double] = js.undefined
  }
  object ExecutionProbe {
    
    inline def apply(): ExecutionProbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionProbe]
    }
    
    extension [Self <: ExecutionProbe](x: Self) {
      
      inline def setMaxNumTensors(value: Double): Self = StObject.set(x, "maxNumTensors", value.asInstanceOf[js.Any])
      
      inline def setMaxNumTensorsUndefined: Self = StObject.set(x, "maxNumTensors", js.undefined)
      
      inline def setMinNumTensors(value: Double): Self = StObject.set(x, "minNumTensors", value.asInstanceOf[js.Any])
      
      inline def setMinNumTensorsUndefined: Self = StObject.set(x, "minNumTensors", js.undefined)
    }
  }
  
  trait Feed extends StObject {
    
    var key: SymbolicTensor
    
    var value: Tensor[Rank]
  }
  object Feed {
    
    inline def apply(key: SymbolicTensor, value: Tensor[Rank]): Feed = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feed]
    }
    
    extension [Self <: Feed](x: Self) {
      
      inline def setKey(value: SymbolicTensor): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Tensor[Rank]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RecipientMap = StringDictionary[Set[String]]
}
