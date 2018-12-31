package typings
package vsoDashNodeDashApiLib.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/Serialization", "ContractSerializer")
@js.native
object ContractSerializerNs extends js.Object {
  /**
    * Process a pure JSON object (e.g. that came from a REST call) and transform it into a JS object
    * where date strings are converted to Date objects and enum values are converted from strings into
    * their numerical value.
    *
    * @param data The object to deserialize
    * @param contractMetadata The type info/metadata for the contract type being deserialize
    * @param preserveOriginal If true, don't modify the original object. False modifies the original object (the return value points to the data argument).
    * @param unwrapWrappedCollections If true check for wrapped arrays (REST apis will not return arrays directly as the root result but will instead wrap them in a { values: [], count: 0 } object.
    */
  def deserialize(
    data: js.Any,
    contractMetadata: vsoDashNodeDashApiLib.serializationMod.ContractMetadata,
    preserveOriginal: scala.Boolean,
    unwrapWrappedCollections: scala.Boolean
  ): js.Any = js.native
  /**
    * Process a contract in its raw form (e.g. date fields are Dates, and Enums are numbers) and
    * return a pure JSON object that can be posted to REST endpoint.
    *
    * @param data The object to serialize
    * @param contractMetadata The type info/metadata for the contract type being serialized
    * @param preserveOriginal If true, don't modify the original object. False modifies the original object (the return value points to the data argument).
    */
  def serialize(
    data: js.Any,
    contractMetadata: vsoDashNodeDashApiLib.serializationMod.ContractMetadata,
    preserveOriginal: scala.Boolean
  ): js.Any = js.native
}

