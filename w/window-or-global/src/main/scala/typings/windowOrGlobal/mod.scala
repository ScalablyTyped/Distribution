package typings.windowOrGlobal

import org.scalablytyped.runtime.TopLevel
import typings.node.NodeJS.Global
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("window-or-global", JSImport.Namespace)
@js.native
object mod
  extends TopLevel[
      (/* globalThis */ js.Any) with ((Window with (/* globalThis */ js.Any)) | (Global with (/* globalThis */ js.Any)))
    ]
