package typings.wordpressCompose

import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseViewportMatchMod {
  
  object default {
    
    /**
      * Returns true if the viewport matches the given query, or false otherwise.
      *
      * @param {WPBreakpoint}       breakpoint      Breakpoint size name.
      * @param {WPViewportOperator} [operator=">="] Viewport operator.
      *
      * @example
      *
      * ```js
      * useViewportMatch( 'huge', '<' );
      * useViewportMatch( 'medium' );
      * ```
      *
      * @return {boolean} Whether viewport matches query.
      */
    inline def apply(breakpoint: WPBreakpoint): Boolean = ^.asInstanceOf[js.Dynamic].apply(breakpoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(breakpoint: WPBreakpoint, operator: WPViewportOperator): Boolean = (^.asInstanceOf[js.Dynamic].apply(breakpoint.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@wordpress/compose/build-types/hooks/use-viewport-match", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/compose/build-types/hooks/use-viewport-match", "default.__experimentalWidthProvider")
    @js.native
    val experimentalWidthProvider: Provider[Double | Null] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressCompose.wordpressComposeStrings.huge
    - typings.wordpressCompose.wordpressComposeStrings.wide
    - typings.wordpressCompose.wordpressComposeStrings.large
    - typings.wordpressCompose.wordpressComposeStrings.medium
    - typings.wordpressCompose.wordpressComposeStrings.small
    - typings.wordpressCompose.wordpressComposeStrings.mobile
  */
  trait WPBreakpoint extends StObject
  object WPBreakpoint {
    
    inline def huge: typings.wordpressCompose.wordpressComposeStrings.huge = "huge".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.huge]
    
    inline def large: typings.wordpressCompose.wordpressComposeStrings.large = "large".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.large]
    
    inline def medium: typings.wordpressCompose.wordpressComposeStrings.medium = "medium".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.medium]
    
    inline def mobile: typings.wordpressCompose.wordpressComposeStrings.mobile = "mobile".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.mobile]
    
    inline def small: typings.wordpressCompose.wordpressComposeStrings.small = "small".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.small]
    
    inline def wide: typings.wordpressCompose.wordpressComposeStrings.wide = "wide".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.wide]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressCompose.wordpressComposeStrings.GreaterthansignEqualssign
    - typings.wordpressCompose.wordpressComposeStrings.Lessthansign
  */
  trait WPViewportOperator extends StObject
  object WPViewportOperator {
    
    inline def GreaterthansignEqualssign: typings.wordpressCompose.wordpressComposeStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typings.wordpressCompose.wordpressComposeStrings.Lessthansign = "<".asInstanceOf[typings.wordpressCompose.wordpressComposeStrings.Lessthansign]
  }
}
