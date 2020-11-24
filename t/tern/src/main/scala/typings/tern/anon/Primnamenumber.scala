package typings.tern.anon

import typings.tern.inferMod.ANull
import typings.tern.inferMod.AVal
import typings.tern.inferMod.Prim
import typings.tern.inferMod.Type
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tern.tern/lib/infer.Prim & {  name :'number'} */
@js.native
trait Primnamenumber extends js.Object {
  
  def addType(args: js.Any*): Unit = js.native
  
  def forAllProps(args: js.Any*): Unit = js.native
  
  def gatherProperties(args: js.Any*): Unit = js.native
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  
  def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  
  def getObjType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  
  def getProp(args: js.Any*): ANull = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  
  def getSymbolType(args: js.Any*): js.UndefOr[ANull] = js.native
  
  def getType(): Prim = js.native
  def getType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  @JSName("getType")
  def getType_Type(): Type = js.native
  
  def hasType(args: js.Any*): Boolean = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): Boolean = js.native
  
  def isEmpty(args: js.Any*): Boolean = js.native
  
  /** The name of the type, if any. */
  var name: (string | bool | number) with number = js.native
  
  /** The origin file of the type. */
  var origin: String = js.native
  
  /**
    * The syntax node that defined the type. Only present for object and function types,
    * and even for those it may be missing (if the type was created by a type definition file,
    * or synthesized in some other way).
    */
  var originNode: js.UndefOr[typings.estree.mod.Node] = js.native
  
  def propHint(args: js.Any*): js.UndefOr[String] = js.native
  
  def propagate(args: js.Any*): Unit = js.native
  
  def propagatesTo(): js.Any = js.native
  
  /** The prototype of the object, or null. */
  var proto: Objnamestring = js.native
  
  def toString(args: js.Any*): String = js.native
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  def toString(maxDepth: Double): String = js.native
  
  def typeHint(args: js.Any*): js.UndefOr[ANull | Null] = js.native
}
