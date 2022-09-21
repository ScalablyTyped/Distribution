package typings.typeormAuroraDataApiDriver

import typings.typeormAuroraDataApiDriver.entityCategoryMod.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityPostMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/Post", "Post")
  @js.native
  open class Post () extends StObject {
    
    var categories: js.Array[Category] = js.native
    
    var id: Double = js.native
    
    var likesCount: Double = js.native
    
    var publishedAt: js.Date = js.native
    
    var text: String = js.native
    
    var title: String = js.native
    
    var updatedAt: js.UndefOr[js.Date] = js.native
  }
}
