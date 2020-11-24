package typings.typeorm.mod

import typings.typeorm.loggerLoggerOptionsMod.FileLoggerOptions
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

@JSImport("typeorm", "FileLogger")
@js.native
class FileLogger ()
  extends typings.typeorm.loggerFileLoggerMod.FileLogger {
  def this(options: js.Array[log | info | warn | query | schema | error | migration]) = this()
  def this(options: Boolean) = this()
  def this(options: all) = this()
  def this(options: js.UndefOr[scala.Nothing], fileLoggerOptions: FileLoggerOptions) = this()
  def this(
    options: js.Array[log | info | warn | query | schema | error | migration],
    fileLoggerOptions: FileLoggerOptions
  ) = this()
  def this(options: Boolean, fileLoggerOptions: FileLoggerOptions) = this()
  def this(options: all, fileLoggerOptions: FileLoggerOptions) = this()
}
