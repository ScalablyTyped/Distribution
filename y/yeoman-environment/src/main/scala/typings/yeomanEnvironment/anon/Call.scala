package typings.yeomanEnvironment.anon

import typings.std.Parameters
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  /**
    * Writes a log-message.
    *
    * @param format
    * The format of the log-messages.
    * See <https://github.com/mikeal/logref> for more info.
    *
    * @param params
    * The parameters to replace variables with.
    */
  def apply(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  /**
    * Writes a log-message.
    */
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Console['error']> is not an array type */ args: Parameters[js.Function1[/* repeated */ _, Unit]]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  def apply(format: js.UndefOr[scala.Nothing], params: Record[String, _]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  def apply(format: String): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  def apply(format: String, params: Record[String, _]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  
  /**
    * Writes an error-message with a prepended cross mark.
    */
  def error(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ _, /* repeated */ _, String]]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  
  /**
    * Writes a success status with a check mark `✔`.
    */
  def ok(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ _, /* repeated */ _, String]]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  
  /**
    * Writes a table to the console.
    */
  var table: FnCall = js.native
  
  /**
    * Writes a log-message.
    */
  def write(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ _, /* repeated */ _, String]]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
  
  /**
    * Writes a log-message with an appended newline character.
    */
  def writeln(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof format> is not an array type */ args: Parameters[js.Function2[/* format */ _, /* repeated */ _, String]]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias yeoman-environment.yeoman-environment/lib/util/log.Logger<TCategories> */ js.Object = js.native
}
