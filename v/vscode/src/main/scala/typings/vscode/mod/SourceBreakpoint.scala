package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SourceBreakpoint")
@js.native
class SourceBreakpoint protected () extends Breakpoint {
  /**
    * Create a new breakpoint for a source location.
    */
  def this(location: Location) = this()
  def this(location: Location, enabled: Boolean) = this()
  def this(location: Location, enabled: js.UndefOr[scala.Nothing], condition: String) = this()
  def this(location: Location, enabled: Boolean, condition: String) = this()
  def this(
    location: Location,
    enabled: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    hitCondition: String
  ) = this()
  def this(location: Location, enabled: js.UndefOr[scala.Nothing], condition: String, hitCondition: String) = this()
  def this(location: Location, enabled: Boolean, condition: js.UndefOr[scala.Nothing], hitCondition: String) = this()
  def this(location: Location, enabled: Boolean, condition: String, hitCondition: String) = this()
  def this(
    location: Location,
    enabled: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    hitCondition: js.UndefOr[scala.Nothing],
    logMessage: String
  ) = this()
  def this(
    location: Location,
    enabled: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    hitCondition: String,
    logMessage: String
  ) = this()
  def this(
    location: Location,
    enabled: js.UndefOr[scala.Nothing],
    condition: String,
    hitCondition: js.UndefOr[scala.Nothing],
    logMessage: String
  ) = this()
  def this(
    location: Location,
    enabled: js.UndefOr[scala.Nothing],
    condition: String,
    hitCondition: String,
    logMessage: String
  ) = this()
  def this(
    location: Location,
    enabled: Boolean,
    condition: js.UndefOr[scala.Nothing],
    hitCondition: js.UndefOr[scala.Nothing],
    logMessage: String
  ) = this()
  def this(
    location: Location,
    enabled: Boolean,
    condition: js.UndefOr[scala.Nothing],
    hitCondition: String,
    logMessage: String
  ) = this()
  def this(
    location: Location,
    enabled: Boolean,
    condition: String,
    hitCondition: js.UndefOr[scala.Nothing],
    logMessage: String
  ) = this()
  def this(location: Location, enabled: Boolean, condition: String, hitCondition: String, logMessage: String) = this()
  /**
    * The source and line position of this breakpoint.
    */
  val location: Location = js.native
}

