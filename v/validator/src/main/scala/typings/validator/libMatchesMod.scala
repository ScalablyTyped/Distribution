package typings.validator

import org.scalablytyped.runtime.TopLevel
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/matches", JSImport.Namespace)
@js.native
object libMatchesMod
  extends TopLevel[
      (js.Function3[
        /* str */ String, 
        /* pattern */ RegExp | String, 
        /* modifiers */ js.UndefOr[String], 
        Boolean
      ]) with (/* import warning: ResolveTypeQueries.resolve Loop while resolving typeof validator.matches */ js.Any)
    ]

