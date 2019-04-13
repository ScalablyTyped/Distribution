package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object GmeCommonNs {
  type ArtifactHash = java.lang.String
  type Aspect = java.lang.String
  type AttrMeta = js.Any
  type Buffer = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GLbyte */ js.Any
  ]
  type CatchCallback = ErrorOnlyCallback
  type Constraint = java.lang.String
  type Content = DataObject | Buffer | js.Array[Buffer]
  type ContentString = java.lang.String
  type CrosscutsInfo = Registry
  type DataObject = webgmeLib.CoreNs.Node
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorOnlyCallback = js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  type ErrorStr = java.lang.String
  type ISO8601 = java.lang.String
  type InAttr = RegObj | Primitive | scala.Null
  /**
    * Callback for loadObject.
    *
    * @callback ProjectInterface~loadObjectCallback
    * @param {Error} err - If error occurred.
    * @param {module:Storage~CommitObject|module:Core~ObjectData} object - Object loaded from database, e.g. a commit object.
    */
  type LoadObject = webgmeLib.GmeStorageNs.CommitObject | webgmeLib.CoreNs.DataObject
  type MemberId = Path
  type Metadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MetadataHash = java.lang.String
  type Name = java.lang.String
  type NodeId = java.lang.String
  type OutAttr = js.UndefOr[DataObject | Primitive | scala.Null]
  type OutPath = js.UndefOr[java.lang.String | scala.Null]
  type Path = java.lang.String
  type Payload = java.lang.String | Buffer | js.Array[Buffer]
  type Primitive = java.lang.String | scala.Double
  type ProjectStart = java.lang.String | webgmeLib.GmeStorageNs.CommitHash | js.Array[java.lang.String] | js.Array[webgmeLib.GmeStorageNs.CommitHash]
  type Registry = js.Any
  type RelId = java.lang.String
  type ResultCallback[T] = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ T, scala.Unit]
  type SetId = java.lang.String
  type ThenCallback = VoidCallback
  type VoidCallback = js.Function0[scala.Unit]
  type VoidFn = js.Function0[scala.Unit]
}
