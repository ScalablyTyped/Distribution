package typings.varstruct

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bytes[T] extends StObject {
    
    def apply(buffer: Buffer): T = js.native
    def apply(buffer: Buffer, start: Double): T = js.native
    def apply(buffer: Buffer, start: Double, end: Double): T = js.native
    def apply(buffer: Buffer, start: Unit, end: Double): T = js.native
    
    val bytes: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait Call[T] extends StObject {
    
    def apply(value: T): Buffer = js.native
    def apply(value: T, buffer: Unit, offset: Double): Buffer = js.native
    def apply(value: T, buffer: Buffer): Buffer = js.native
    def apply(value: T, buffer: Buffer, offset: Double): Buffer = js.native
    
    val bytes: js.UndefOr[Double] = js.native
  }
}
