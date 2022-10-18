package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generator extends StObject {
  
  def generate(module: NormalModule, __1: GenerateContext): Source = js.native
  
  def getConcatenationBailoutReason(module: NormalModule, context: ConcatenationBailoutReasonContext): js.UndefOr[String] = js.native
  
  def getSize(module: NormalModule): Double = js.native
  def getSize(module: NormalModule, `type`: String): Double = js.native
  
  def getTypes(module: NormalModule): Set[String] = js.native
  
  def updateHash(hash: Hash, __1: UpdateHashContextGenerator): Unit = js.native
}
