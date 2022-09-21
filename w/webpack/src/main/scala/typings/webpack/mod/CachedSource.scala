package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachedSource
  extends StObject
     with Source {
  
  def getCachedData(): Any = js.native
  
  def original(): Source = js.native
  
  def originalLazy(): Source | js.Function0[Source] = js.native
}
