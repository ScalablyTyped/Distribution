package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Payload
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNameO extends js.Object {
  def apply(o: StringDictionary[Payload]): js.Promise[js.Array[MetadataHash]] = js.native
  def apply(o: StringDictionary[Payload], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}

