package typings.taskkill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("taskkill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def taskkill(input: Input): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskkill")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def taskkill(input: Input, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("taskkill")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def taskkillSync(input: Input): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("taskkillSync")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def taskkillSync(input: Input, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("taskkillSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Input = String | (js.Array[Double | String]) | Double
  
  trait Options extends StObject {
    
    /**
      * Types of processes to include or exclude from termination.
      * See the `taskkill` docs for supported filters.
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /**
      * Forcefully terminate processes.
      * Ignored for remote processes as all remote processes are forcefully terminated.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Password of the user account for the specified `username`.
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Name or IP address of a remote computer (do not use backslashes).
      * The default is the local computer.
      */
    var system: js.UndefOr[String] = js.undefined
    
    /**
      * Terminate all child processes along with the parent process, commonly known as a tree kill.
      */
    var tree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A user specified by User or Domain\User.
      * The default is the permissions of the current logged on user on the computer issuing the command.
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      inline def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
