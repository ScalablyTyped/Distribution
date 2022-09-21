package typings.utf8Validate

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Checks whether a buffer contains valid UTF-8.
    *
    * @param buffer - The buffer to check.
    *
    * @returns `true` if the buffer contains only correct UTF-8, else `false`.
    */
  inline def apply(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("utf-8-validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
