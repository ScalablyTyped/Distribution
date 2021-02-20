package typings.supertestAsPromised

import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("supertest-as-promised", JSImport.Namespace)
  @js.native
  def apply(app: js.Any): SuperTest[Test] = js.native
  
  @JSImport("supertest-as-promised", "agent")
  @js.native
  def agent(): SuperTest[Test] = js.native
  @JSImport("supertest-as-promised", "agent")
  @js.native
  def agent(app: js.Any): SuperTest[Test] = js.native
  
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  
  type Request = typings.supertest.mod.Request
  
  type Response = typings.supertest.mod.Response
  
  type SuperTest[T /* <: Request */] = typings.supertest.mod.SuperTest[T]
  
  @js.native
  trait Test
    extends typings.supertest.mod.Test {
    
    def timeout(): js.Promise[Response] with this.type = js.native
    
    def toPromise(): ^[Response] = js.native
  }
}
