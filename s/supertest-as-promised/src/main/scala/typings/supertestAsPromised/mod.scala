package typings.supertestAsPromised

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(app: js.Any): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest[Test]]
  
  @JSImport("supertest-as-promised", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def agent(): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")().asInstanceOf[SuperTest[Test]]
  @scala.inline
  def agent(app: js.Any): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest[Test]]
  
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  
  type Request = typings.supertest.mod.Request
  
  type Response = typings.supertest.mod.Response
  
  type SuperTest[T /* <: Request */] = typings.supertest.mod.SuperTest[T]
  
  @js.native
  trait Test
    extends typings.supertest.mod.Test {
    
    def timeout(): js.Promise[Response] & this.type = js.native
    
    def toPromise(): typings.bluebird.mod.^[Response] = js.native
  }
}
