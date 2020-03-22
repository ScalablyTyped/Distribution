package typings.tensorflowTfjsLayers.executorMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "FeedDict")
@js.native
/**
  * Constructor, optionally does copy-construction.
  * @param feeds An Array of `Feed`s, or another `FeedDict`, in which case
  *   copy-construction will be performed.
  */
class FeedDict () extends js.Object {
  def this(feeds: js.Array[Feed]) = this()
  def this(feeds: FeedDict) = this()
  var id2Mask: js.Any = js.native
  var id2Value: js.Any = js.native
  var name2Id: js.Any = js.native
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
  /**
    * Get all the SymbolicTensor available in this FeedDict.
    */
  def names(): js.Array[String] = js.native
}

