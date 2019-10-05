package typings.tern.libInferMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANull extends js.Object {
  def addType(args: js.Any*): Unit
  def forAllProps(args: js.Any*): Unit
  def gatherProperties(args: js.Any*): Unit
  def getFunctionType(args: js.Any*): js.UndefOr[ANull]
  def getObjType(args: js.Any*): js.UndefOr[ANull | Null]
  def getProp(args: js.Any*): ANull
  def getSymbolType(args: js.Any*): js.UndefOr[ANull]
  def getType(args: js.Any*): js.UndefOr[ANull | Null]
  def hasType(args: js.Any*): Boolean
  def isEmpty(args: js.Any*): Boolean
  def propHint(args: js.Any*): js.UndefOr[String]
  def propagate(args: js.Any*): Unit
  def propagatesTo(): js.Any
  def toString(args: js.Any*): String
  def typeHint(args: js.Any*): js.UndefOr[ANull | Null]
}

@JSImport("tern/lib/infer", "ANull")
@js.native
object ANull extends TopLevel[ANull]

