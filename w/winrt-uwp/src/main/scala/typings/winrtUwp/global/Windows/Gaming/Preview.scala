package typings.winrtUwp.global.Windows.Gaming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Gaming.Preview")
@js.native
object Preview extends js.Object {
  
  @js.native
  object GamesEnumeration extends js.Object {
    
    @js.native
    abstract class GameList ()
      extends typings.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameList
    /* static members */
    @js.native
    object GameList extends js.Object {
      
      var addEventListener: js.Any = js.native
      
       /* unmapped type */ var findAllAsync: js.Any = js.native
      
       /* unmapped type */ var ongameadded: js.Any = js.native
      
       /* unmapped type */ var ongameremoved: js.Any = js.native
      
       /* unmapped type */ var ongameupdated: js.Any = js.native
      
       /* unmapped type */ var removeEventListener: js.Any = js.native
    }
    
    @js.native
    object GameListCategory extends js.Object {
      
      var candidate: js.Any = js.native
      
      var confirmedBySystem: js.Any = js.native
      
      var confirmedByUser: js.Any = js.native
    }
    
    @js.native
    abstract class GameListEntry ()
      extends typings.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameListEntry
  }
}
