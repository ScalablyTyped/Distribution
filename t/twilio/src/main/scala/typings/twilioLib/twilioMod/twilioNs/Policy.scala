package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Policy extends js.Object {
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var allow: scala.Boolean
  var method: java.lang.String
   // Map<string, FilterRequirement>, where FilterRequirement ::= Map<string, boolean>
  var post_filter: js.UndefOr[js.Any] = js.undefined
  var query_filter: js.UndefOr[js.Any] = js.undefined
  var url: java.lang.String
}

