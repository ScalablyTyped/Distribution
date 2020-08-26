package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANull extends js.Object {
  def addType(args: js.Any*): Unit = js.native
  def forAllProps(args: js.Any*): Unit = js.native
  def gatherProperties(args: js.Any*): Unit = js.native
  def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  def getObjType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  def getProp(args: js.Any*): ANull = js.native
  def getSymbolType(args: js.Any*): js.UndefOr[ANull] = js.native
  def getType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  def hasType(args: js.Any*): Boolean = js.native
  def isEmpty(args: js.Any*): Boolean = js.native
  def propHint(args: js.Any*): js.UndefOr[String] = js.native
  def propagate(args: js.Any*): Unit = js.native
  def propagatesTo(): js.Any = js.native
  def toString(args: js.Any*): String = js.native
  def typeHint(args: js.Any*): js.UndefOr[ANull | Null] = js.native
}

@JSImport("tern/lib/infer", "ANull")
@js.native
object ANull extends TopLevel[ANull]

