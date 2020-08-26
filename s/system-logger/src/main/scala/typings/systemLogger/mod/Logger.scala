package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("system-logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(configuration: LoggerConfiguration) = this()
  def this(configuration: js.UndefOr[scala.Nothing], fileConfig: FileConfiguration) = this()
  def this(configuration: LoggerConfiguration, fileConfig: FileConfiguration) = this()
  def this(
    configuration: js.UndefOr[scala.Nothing],
    fileConfig: js.UndefOr[scala.Nothing],
    sourceConfig: SourcesConfiguration
  ) = this()
  def this(
    configuration: js.UndefOr[scala.Nothing],
    fileConfig: FileConfiguration,
    sourceConfig: SourcesConfiguration
  ) = this()
  def this(
    configuration: LoggerConfiguration,
    fileConfig: js.UndefOr[scala.Nothing],
    sourceConfig: SourcesConfiguration
  ) = this()
  def this(
    configuration: LoggerConfiguration,
    fileConfig: FileConfiguration,
    sourceConfig: SourcesConfiguration
  ) = this()
  def log(level: String, message: String): Unit = js.native
  def log(level: String, message: String, optional: js.Any): Unit = js.native
  def log(level: level, message: String): Unit = js.native
  def log(level: level, message: String, optional: js.Any): Unit = js.native
}

