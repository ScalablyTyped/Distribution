package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type DefinitionFilter = <T extends wechat-miniprogram.WechatMiniprogram.Component.TrivialOption>(defFields : T, definitionFilterArr : std.Array<wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter> | undefined): void
}}}
to avoid circular code involving: 
- wechat-miniprogram.WechatMiniprogram.Behavior.DefinitionFilter
- wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter
*/
@js.native
trait DefinitionFilter extends StObject {
  
  def apply[T /* <: TrivialOption */](/** 使用该 behavior 的 component/behavior 的定义对象 */
  defFields: T): Unit = js.native
  def apply[T /* <: TrivialOption */](
    /** 使用该 behavior 的 component/behavior 的定义对象 */
  defFields: T,
    /** 该 behavior 所使用的 behavior 的 definitionFilter 函数列表 */
  definitionFilterArr: js.Array[DefinitionFilter]
  ): Unit = js.native
}
