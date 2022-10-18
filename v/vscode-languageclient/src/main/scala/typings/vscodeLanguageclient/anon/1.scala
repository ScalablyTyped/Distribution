package typings.vscodeLanguageclient.anon

import typings.vscode.mod.TextDocumentChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def send(event: TextDocumentChangeEvent): js.Promise[Unit]
}
object `1` {
  
  inline def apply(send: TextDocumentChangeEvent => js.Promise[Unit]): `1` = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setSend(value: TextDocumentChangeEvent => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
