package typings.winrtDashUwp.Windows.Gaming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Gaming.Preview")
@js.native
object Preview extends js.Object {
  @js.native
  object GamesEnumeration extends js.Object {
    @js.native
    abstract class GameList () extends js.Object
    
    @js.native
    abstract class GameListEntry () extends js.Object {
      var category: js.Any = js.native
       /* unmapped type */ var displayInfo: js.Any = js.native
       /* unmapped type */ var launchAsync: js.Any = js.native
       /* unmapped type */ var properties: js.Any = js.native
       /* unmapped type */ var setCategoryAsync: js.Any = js.native
    }
    
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
    
  }
  
}

