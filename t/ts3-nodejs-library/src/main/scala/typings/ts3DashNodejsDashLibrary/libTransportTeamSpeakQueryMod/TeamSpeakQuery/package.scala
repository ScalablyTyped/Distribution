package typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TeamSpeakQuery {
  import typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command.ParserCallback
  import typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command.flags
  import typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command.multiOpts
  import typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command.options

  type executeArgs = ParserCallback | multiOpts | options | flags
}
