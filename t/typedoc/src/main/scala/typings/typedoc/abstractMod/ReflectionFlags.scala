package typings.typedoc.abstractMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionFlags")
@js.native
class ReflectionFlags () extends Array[String] {
  
  var flags: js.Any = js.native
  
  def hasExportAssignment: Boolean = js.native
  
  def hasFlag(flag: ReflectionFlag): Boolean = js.native
  
  def isAbstract: Boolean = js.native
  
  def isConst: Boolean = js.native
  
  def isConstructorProperty: Boolean = js.native
  
  def isExported: Boolean = js.native
  
  def isExternal: Boolean = js.native
  
  def isLet: Boolean = js.native
  
  def isOptional: Boolean = js.native
  
  def isPrivate: Boolean = js.native
  
  def isProtected: Boolean = js.native
  
  def isPublic: Boolean = js.native
  
  def isReadonly: Boolean = js.native
  
  def isRest: Boolean = js.native
  
  def isStatic: Boolean = js.native
  
  def setFlag(flag: ReflectionFlag, set: Boolean): Unit = js.native
  
  var setSingleFlag: js.Any = js.native
}
