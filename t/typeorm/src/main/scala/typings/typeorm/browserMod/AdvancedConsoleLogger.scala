package typings.typeorm.browserMod

import typings.typeorm.typeormStrings.all
import typings.typeorm.typeormStrings.error
import typings.typeorm.typeormStrings.info
import typings.typeorm.typeormStrings.log
import typings.typeorm.typeormStrings.migration
import typings.typeorm.typeormStrings.query
import typings.typeorm.typeormStrings.schema
import typings.typeorm.typeormStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "AdvancedConsoleLogger")
@js.native
class AdvancedConsoleLogger ()
  extends typings.typeorm.advancedConsoleLoggerMod.AdvancedConsoleLogger {
  def this(options: js.Array[error | log | info | warn | query | schema | migration]) = this()
  def this(options: Boolean) = this()
  def this(options: all) = this()
}
