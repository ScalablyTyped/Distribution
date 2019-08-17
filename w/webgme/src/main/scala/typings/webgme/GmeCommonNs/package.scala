package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeCommonNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error
  import typings.webgme.CoreNs.Node
  import typings.webgme.GmeStorageNs.CommitHash
  import typings.webgme.GmeStorageNs.CommitObject

  type ArtifactHash = String
  type Aspect = String
  type AttrMeta = js.Any
  type Buffer = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GLbyte */ js.Any
  ]
  type CatchCallback = ErrorOnlyCallback
  type Constraint = String
  type Content = DataObject | Buffer | js.Array[Buffer]
  type ContentString = String
  type CrosscutsInfo = Registry
  type DataObject = Node
  type Dictionary[T] = StringDictionary[T]
  type ErrorOnlyCallback = js.Function1[/* err */ Error | Null, Unit]
  type ErrorStr = String
  type ISO8601 = String
  type InAttr = RegObj | Primitive | Null
  /**
    * Callback for loadObject.
    *
    * @callback ProjectInterface~loadObjectCallback
    * @param {Error} err - If error occurred.
    * @param {module:Storage~CommitObject|module:Core~ObjectData} object - Object loaded from database, e.g. a commit object.
    */
  type LoadObject = CommitObject | typings.webgme.CoreNs.DataObject
  type MemberId = Path
  type Metadata = StringDictionary[js.Any]
  type MetadataHash = String
  type Name = String
  type NodeId = String
  type OutAttr = js.UndefOr[DataObject | Primitive | Null]
  type OutPath = js.UndefOr[String | Null]
  type Path = String
  type Payload = String | Buffer | js.Array[Buffer]
  type Primitive = String | Double
  type ProjectStart = String | CommitHash | (js.Array[CommitHash | String])
  type Registry = js.Any
  type RelId = String
  type ResultCallback[T] = js.Function2[/* err */ Error | Null, /* result */ T, Unit]
  type SetId = String
  type ThenCallback = VoidCallback
  type VoidCallback = js.Function0[Unit]
  type VoidFn = js.Function0[Unit]
}
