package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  P extends {  success :any} ? void : P extends {  fail :any} ? void : P extends {  complete :any} ? void : std.Promise<std.Parameters<std.Exclude<T['success'], undefined>>[0]>
  }}}
  */
@js.native
trait PromisifySuccessResult[P, T /* <: AsyncMethodOptionLike */] extends StObject
