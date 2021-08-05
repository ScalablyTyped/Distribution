package typings.typeorm

import typings.typeorm.typeormStrings.`after-insert`
import typings.typeorm.typeormStrings.`after-load`
import typings.typeorm.typeormStrings.`after-remove`
import typings.typeorm.typeormStrings.`after-update`
import typings.typeorm.typeormStrings.`before-insert`
import typings.typeorm.typeormStrings.`before-remove`
import typings.typeorm.typeormStrings.`before-update`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventListenerTypesMod {
  
  @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes")
  @js.native
  class EventListenerTypes () extends StObject
  /* static members */
  object EventListenerTypes {
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.AFTER_INSERT")
    @js.native
    def AFTER_INSERT: `after-insert` = js.native
    inline def AFTER_INSERT_=(x: `after-insert`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER_INSERT")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.AFTER_LOAD")
    @js.native
    def AFTER_LOAD: `after-load` = js.native
    inline def AFTER_LOAD_=(x: `after-load`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER_LOAD")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.AFTER_REMOVE")
    @js.native
    def AFTER_REMOVE: `after-remove` = js.native
    inline def AFTER_REMOVE_=(x: `after-remove`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER_REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.AFTER_UPDATE")
    @js.native
    def AFTER_UPDATE: `after-update` = js.native
    inline def AFTER_UPDATE_=(x: `after-update`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AFTER_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.BEFORE_INSERT")
    @js.native
    def BEFORE_INSERT: `before-insert` = js.native
    inline def BEFORE_INSERT_=(x: `before-insert`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE_INSERT")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.BEFORE_REMOVE")
    @js.native
    def BEFORE_REMOVE: `before-remove` = js.native
    inline def BEFORE_REMOVE_=(x: `before-remove`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE_REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/browser/metadata/types/EventListenerTypes", "EventListenerTypes.BEFORE_UPDATE")
    @js.native
    def BEFORE_UPDATE: `before-update` = js.native
    inline def BEFORE_UPDATE_=(x: `before-update`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEFORE_UPDATE")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeorm.typeormStrings.`after-load`
    - typings.typeorm.typeormStrings.`before-insert`
    - typings.typeorm.typeormStrings.`after-insert`
    - typings.typeorm.typeormStrings.`before-update`
    - typings.typeorm.typeormStrings.`after-update`
    - typings.typeorm.typeormStrings.`before-remove`
    - typings.typeorm.typeormStrings.`after-remove`
  */
  trait EventListenerType extends StObject
  object EventListenerType {
    
    inline def `after-insert`: typings.typeorm.typeormStrings.`after-insert` = "after-insert".asInstanceOf[typings.typeorm.typeormStrings.`after-insert`]
    
    inline def `after-load`: typings.typeorm.typeormStrings.`after-load` = "after-load".asInstanceOf[typings.typeorm.typeormStrings.`after-load`]
    
    inline def `after-remove`: typings.typeorm.typeormStrings.`after-remove` = "after-remove".asInstanceOf[typings.typeorm.typeormStrings.`after-remove`]
    
    inline def `after-update`: typings.typeorm.typeormStrings.`after-update` = "after-update".asInstanceOf[typings.typeorm.typeormStrings.`after-update`]
    
    inline def `before-insert`: typings.typeorm.typeormStrings.`before-insert` = "before-insert".asInstanceOf[typings.typeorm.typeormStrings.`before-insert`]
    
    inline def `before-remove`: typings.typeorm.typeormStrings.`before-remove` = "before-remove".asInstanceOf[typings.typeorm.typeormStrings.`before-remove`]
    
    inline def `before-update`: typings.typeorm.typeormStrings.`before-update` = "before-update".asInstanceOf[typings.typeorm.typeormStrings.`before-update`]
  }
}
