package typings.tokeyCore

import typings.tokeyCore.distTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSeekerMod {
  
  @JSImport("@tokey/core/dist/seeker", "Seeker")
  @js.native
  open class Seeker[T /* <: Token[Any] */] protected () extends StObject {
    def this(tokens: js.Array[T]) = this()
    
    def back(): Unit = js.native
    
    def done(): Boolean = js.native
    
    @JSName("eat")
    def eat_type(`type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): this.type = js.native
    
    def flatBlock(start: String, end: String): js.UndefOr[js.Array[T]] = js.native
    def flatBlock(start: String, end: String, isEndError: js.Function1[/* token */ Token[Any], Boolean]): js.UndefOr[js.Array[T]] = js.native
    
    var index: Double = js.native
    
    def next(): T = js.native
    
    def peek(): T = js.native
    def peek(num: Double): T = js.native
    
    def peekBack(): T = js.native
    
    def run[A](
      handleToken: js.Function4[/* token */ T, /* ast */ A, /* source */ String, /* seeker */ this.type, Unit | Boolean],
      ast: A,
      source: String
    ): A = js.native
    
    @JSName("takeMany")
    def takeMany_type(`type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): js.Array[T] = js.native
    
    @JSName("take")
    def take_type(`type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): js.UndefOr[T] = js.native
    
    var tokens: js.Array[T] = js.native
  }
}
