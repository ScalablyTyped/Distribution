package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InternalSymbolName extends js.Object

@JSImport("typescript", "InternalSymbolName")
@js.native
object InternalSymbolName extends js.Object {
  @js.native
  sealed trait Call
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Class
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Computed
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Constructor
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Default
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait ExportEquals
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait ExportStar
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Function
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Global
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Index
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait JSXAttributes
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Missing
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait New
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Object
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Resolving
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait This
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  @js.native
  sealed trait Type
    extends typescriptLib.typescriptMod.InternalSymbolName
  
  /* "__call" */ val Call: Call with java.lang.String = js.native
  /* "__class" */ val Class: Class with java.lang.String = js.native
  /* "__computed" */ val Computed: Computed with java.lang.String = js.native
  /* "__constructor" */ val Constructor: Constructor with java.lang.String = js.native
  /* "default" */ val Default: Default with java.lang.String = js.native
  /* "export=" */ val ExportEquals: ExportEquals with java.lang.String = js.native
  /* "__export" */ val ExportStar: ExportStar with java.lang.String = js.native
  /* "__function" */ val Function: Function with java.lang.String = js.native
  /* "__global" */ val Global: Global with java.lang.String = js.native
  /* "__index" */ val Index: Index with java.lang.String = js.native
  /* "__jsxAttributes" */ val JSXAttributes: JSXAttributes with java.lang.String = js.native
  /* "__missing" */ val Missing: Missing with java.lang.String = js.native
  /* "__new" */ val New: New with java.lang.String = js.native
  /* "__object" */ val Object: Object with java.lang.String = js.native
  /* "__resolving__" */ val Resolving: Resolving with java.lang.String = js.native
  /* "this" */ val This: This with java.lang.String = js.native
  /* "__type" */ val Type: Type with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[typescriptLib.typescriptMod.InternalSymbolName with java.lang.String] = js.native
}

