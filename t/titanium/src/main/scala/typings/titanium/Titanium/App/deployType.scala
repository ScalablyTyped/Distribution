package typings.titanium.Titanium.App

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Build type that reflects how the application was packaged.
		 * Returns one of the following values:
		 * * `development` (Simulator)
		 * * `test` (Device)
		 * * `production` (App Store / Adhoc)
		 */
@JSGlobal("Titanium.App.deployType")
@js.native
object deployType extends TopLevel[String]

