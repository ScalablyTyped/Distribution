package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackName extends js.Object {
  def apply(objectHashes: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def apply(
    objectHashes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
}

