package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.anon.CategoriesList
import typings.wordpressComponents.anon.MaxItems
import typings.wordpressComponents.anon.OnOrderByChange
import typings.wordpressComponents.queryControlsMod.QueryControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryControlsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/query-controls", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object QueryControls {
    
    type CategoryProps = CategoriesList | js.Object
    
    type NumberProps = MaxItems | js.Object
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.asc
      - typings.wordpressComponents.wordpressComponentsStrings.desc
    */
    trait Order extends StObject
    object Order {
      
      @scala.inline
      def asc: typings.wordpressComponents.wordpressComponentsStrings.asc = "asc".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.asc]
      
      @scala.inline
      def desc: typings.wordpressComponents.wordpressComponentsStrings.desc = "desc".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.desc]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.date
      - typings.wordpressComponents.wordpressComponentsStrings.title
    */
    trait OrderBy extends StObject
    object OrderBy {
      
      @scala.inline
      def date: typings.wordpressComponents.wordpressComponentsStrings.date = "date".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.date]
      
      @scala.inline
      def title: typings.wordpressComponents.wordpressComponentsStrings.title = "title".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.title]
    }
    
    type OrderProps = OnOrderByChange | js.Object
    
    type Props = CategoryProps & OrderProps & NumberProps
  }
}
