package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapSource
  extends StObject
     with Source {
  
  def getArgsAsBuffers(): js.Tuple6[Buffer, String, Buffer, js.UndefOr[Buffer], js.UndefOr[Buffer], Boolean] = js.native
}
