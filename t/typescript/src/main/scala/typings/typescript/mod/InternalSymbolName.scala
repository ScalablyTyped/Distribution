package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InternalSymbolName extends js.Object
@JSImport("typescript", "InternalSymbolName")
@js.native
object InternalSymbolName extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[InternalSymbolName with java.lang.String] = js.native
  
  @js.native
  sealed trait Call extends InternalSymbolName
  /* "__call" */ @js.native
  object Call
    extends TopLevel[Call with java.lang.String]
  
  @js.native
  sealed trait Class extends InternalSymbolName
  /* "__class" */ @js.native
  object Class
    extends TopLevel[Class with java.lang.String]
  
  @js.native
  sealed trait Computed extends InternalSymbolName
  /* "__computed" */ @js.native
  object Computed
    extends TopLevel[Computed with java.lang.String]
  
  @js.native
  sealed trait Constructor extends InternalSymbolName
  /* "__constructor" */ @js.native
  object Constructor
    extends TopLevel[Constructor with java.lang.String]
  
  @js.native
  sealed trait Default extends InternalSymbolName
  /* "default" */ @js.native
  object Default
    extends TopLevel[Default with java.lang.String]
  
  @js.native
  sealed trait ExportEquals extends InternalSymbolName
  /* "export=" */ @js.native
  object ExportEquals
    extends TopLevel[ExportEquals with java.lang.String]
  
  @js.native
  sealed trait ExportStar extends InternalSymbolName
  /* "__export" */ @js.native
  object ExportStar
    extends TopLevel[ExportStar with java.lang.String]
  
  @js.native
  sealed trait Function extends InternalSymbolName
  /* "__function" */ @js.native
  object Function
    extends TopLevel[Function with java.lang.String]
  
  @js.native
  sealed trait Global extends InternalSymbolName
  /* "__global" */ @js.native
  object Global
    extends TopLevel[Global with java.lang.String]
  
  @js.native
  sealed trait Index extends InternalSymbolName
  /* "__index" */ @js.native
  object Index
    extends TopLevel[Index with java.lang.String]
  
  @js.native
  sealed trait JSXAttributes extends InternalSymbolName
  /* "__jsxAttributes" */ @js.native
  object JSXAttributes
    extends TopLevel[JSXAttributes with java.lang.String]
  
  @js.native
  sealed trait Missing extends InternalSymbolName
  /* "__missing" */ @js.native
  object Missing
    extends TopLevel[Missing with java.lang.String]
  
  @js.native
  sealed trait New extends InternalSymbolName
  /* "__new" */ @js.native
  object New
    extends TopLevel[New with java.lang.String]
  
  @js.native
  sealed trait Object extends InternalSymbolName
  /* "__object" */ @js.native
  object Object
    extends TopLevel[Object with java.lang.String]
  
  @js.native
  sealed trait Resolving extends InternalSymbolName
  /* "__resolving__" */ @js.native
  object Resolving
    extends TopLevel[Resolving with java.lang.String]
  
  @js.native
  sealed trait This extends InternalSymbolName
  /* "this" */ @js.native
  object This
    extends TopLevel[This with java.lang.String]
  
  @js.native
  sealed trait Type extends InternalSymbolName
  /* "__type" */ @js.native
  object Type
    extends TopLevel[typings.typescript.mod.InternalSymbolName.Type with java.lang.String]
}
