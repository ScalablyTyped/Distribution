package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InternalSymbolName extends StObject
@JSImport("typescript", "InternalSymbolName")
@js.native
object InternalSymbolName extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[InternalSymbolName with java.lang.String] = js.native
  
  @js.native
  sealed trait Call extends InternalSymbolName
  /* "__call" */ val Call: typings.typescript.mod.InternalSymbolName.Call with java.lang.String = js.native
  
  @js.native
  sealed trait Class extends InternalSymbolName
  /* "__class" */ val Class: typings.typescript.mod.InternalSymbolName.Class with java.lang.String = js.native
  
  @js.native
  sealed trait Computed extends InternalSymbolName
  /* "__computed" */ val Computed: typings.typescript.mod.InternalSymbolName.Computed with java.lang.String = js.native
  
  @js.native
  sealed trait Constructor extends InternalSymbolName
  /* "__constructor" */ val Constructor: typings.typescript.mod.InternalSymbolName.Constructor with java.lang.String = js.native
  
  @js.native
  sealed trait Default extends InternalSymbolName
  /* "default" */ val Default: typings.typescript.mod.InternalSymbolName.Default with java.lang.String = js.native
  
  @js.native
  sealed trait ExportEquals extends InternalSymbolName
  /* "export=" */ val ExportEquals: typings.typescript.mod.InternalSymbolName.ExportEquals with java.lang.String = js.native
  
  @js.native
  sealed trait ExportStar extends InternalSymbolName
  /* "__export" */ val ExportStar: typings.typescript.mod.InternalSymbolName.ExportStar with java.lang.String = js.native
  
  @js.native
  sealed trait Function extends InternalSymbolName
  /* "__function" */ val Function: typings.typescript.mod.InternalSymbolName.Function with java.lang.String = js.native
  
  @js.native
  sealed trait Global extends InternalSymbolName
  /* "__global" */ val Global: typings.typescript.mod.InternalSymbolName.Global with java.lang.String = js.native
  
  @js.native
  sealed trait Index extends InternalSymbolName
  /* "__index" */ val Index: typings.typescript.mod.InternalSymbolName.Index with java.lang.String = js.native
  
  @js.native
  sealed trait JSXAttributes extends InternalSymbolName
  /* "__jsxAttributes" */ val JSXAttributes: typings.typescript.mod.InternalSymbolName.JSXAttributes with java.lang.String = js.native
  
  @js.native
  sealed trait Missing extends InternalSymbolName
  /* "__missing" */ val Missing: typings.typescript.mod.InternalSymbolName.Missing with java.lang.String = js.native
  
  @js.native
  sealed trait New extends InternalSymbolName
  /* "__new" */ val New: typings.typescript.mod.InternalSymbolName.New with java.lang.String = js.native
  
  @js.native
  sealed trait Object extends InternalSymbolName
  /* "__object" */ val Object: typings.typescript.mod.InternalSymbolName.Object with java.lang.String = js.native
  
  @js.native
  sealed trait Resolving extends InternalSymbolName
  /* "__resolving__" */ val Resolving: typings.typescript.mod.InternalSymbolName.Resolving with java.lang.String = js.native
  
  @js.native
  sealed trait This extends InternalSymbolName
  /* "this" */ val This: typings.typescript.mod.InternalSymbolName.This with java.lang.String = js.native
  
  @js.native
  sealed trait Type extends InternalSymbolName
  /* "__type" */ val Type: typings.typescript.mod.InternalSymbolName.Type with java.lang.String = js.native
}
