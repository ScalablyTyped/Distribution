package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InternalSymbolName extends js.Object

@JSImport("typescript", "InternalSymbolName")
@js.native
object InternalSymbolName extends js.Object {
  @js.native
  sealed trait Call extends InternalSymbolName
  
  @js.native
  sealed trait Class extends InternalSymbolName
  
  @js.native
  sealed trait Computed extends InternalSymbolName
  
  @js.native
  sealed trait Constructor extends InternalSymbolName
  
  @js.native
  sealed trait Default extends InternalSymbolName
  
  @js.native
  sealed trait ExportEquals extends InternalSymbolName
  
  @js.native
  sealed trait ExportStar extends InternalSymbolName
  
  @js.native
  sealed trait Function extends InternalSymbolName
  
  @js.native
  sealed trait Global extends InternalSymbolName
  
  @js.native
  sealed trait Index extends InternalSymbolName
  
  @js.native
  sealed trait JSXAttributes extends InternalSymbolName
  
  @js.native
  sealed trait Missing extends InternalSymbolName
  
  @js.native
  sealed trait New extends InternalSymbolName
  
  @js.native
  sealed trait Object extends InternalSymbolName
  
  @js.native
  sealed trait Resolving extends InternalSymbolName
  
  @js.native
  sealed trait This extends InternalSymbolName
  
  @js.native
  sealed trait Type extends InternalSymbolName
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InternalSymbolName with String] = js.native
  /* "__call" */ @js.native
  object Call extends TopLevel[Call with String]
  
  /* "__class" */ @js.native
  object Class extends TopLevel[Class with String]
  
  /* "__computed" */ @js.native
  object Computed extends TopLevel[Computed with String]
  
  /* "__constructor" */ @js.native
  object Constructor extends TopLevel[Constructor with String]
  
  /* "default" */ @js.native
  object Default extends TopLevel[Default with String]
  
  /* "export=" */ @js.native
  object ExportEquals extends TopLevel[ExportEquals with String]
  
  /* "__export" */ @js.native
  object ExportStar extends TopLevel[ExportStar with String]
  
  /* "__function" */ @js.native
  object Function extends TopLevel[Function with String]
  
  /* "__global" */ @js.native
  object Global extends TopLevel[Global with String]
  
  /* "__index" */ @js.native
  object Index extends TopLevel[Index with String]
  
  /* "__jsxAttributes" */ @js.native
  object JSXAttributes extends TopLevel[JSXAttributes with String]
  
  /* "__missing" */ @js.native
  object Missing extends TopLevel[Missing with String]
  
  /* "__new" */ @js.native
  object New extends TopLevel[New with String]
  
  /* "__object" */ @js.native
  object Object extends TopLevel[Object with String]
  
  /* "__resolving__" */ @js.native
  object Resolving extends TopLevel[Resolving with String]
  
  /* "this" */ @js.native
  object This extends TopLevel[This with String]
  
  /* "__type" */ @js.native
  object Type
    extends TopLevel[typings.typescript.typescriptMod.InternalSymbolName.Type with String]
  
}

