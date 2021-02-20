package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecoratorPaths extends StObject {
  
  /**
    * Array of paths to decorators that should be available.
    * 
    * decoratorPaths = ['./src/client/decorators']
    */
  var decoratorPaths: js.Array[String] = js.native
  
  /**
    * Array of decorators (by id) that should be downloaded from the
    *  server before the editor starts 
    * - when set to null all available decorators will be downloaded.
    */
  var decoratorToPreload: Double | Null = js.native
  
  /**
    * Array of paths (in the requirejs sense) to 
    * css files that should be loaded at start up. 
    * (To use this option a path would typically 
    * have to be added at config.requirejsPaths.)
    */
  var extraCss: js.Array[String] = js.native
  
  /**
    * Specifies which layout to use 
    * (directory name must be present in any of the provided base-paths).
    * 
    */
  var layout: Default = js.native
  
  /**
    * Array of base paths that will be mapped from 'panels' in requirejs.
    * 
    * panelPaths = ['../src/client/js/Panels']
    */
  var panelPaths: js.Array[String] = js.native
  
  /**
    * Array of paths to directories containing SVG-files 
    * that will be copied and made available as SVGs 
    * for decorators (ConstraintIcons is currently reserved).
    */
  var svgDirs: js.Array[String] = js.native
  
  /**
    * Array of paths to json-files containing meta-data about the used visualizers.
    * 
    * visualizerDescriptors = ['../src/client/js/Visualizers.json']
    */
  var visualizerDescriptors: js.Array[String] = js.native
}
object DecoratorPaths {
  
  @scala.inline
  def apply(
    decoratorPaths: js.Array[String],
    extraCss: js.Array[String],
    layout: Default,
    panelPaths: js.Array[String],
    svgDirs: js.Array[String],
    visualizerDescriptors: js.Array[String]
  ): DecoratorPaths = {
    val __obj = js.Dynamic.literal(decoratorPaths = decoratorPaths.asInstanceOf[js.Any], extraCss = extraCss.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], panelPaths = panelPaths.asInstanceOf[js.Any], svgDirs = svgDirs.asInstanceOf[js.Any], visualizerDescriptors = visualizerDescriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratorPaths]
  }
  
  @scala.inline
  implicit class DecoratorPathsMutableBuilder[Self <: DecoratorPaths] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecoratorPaths(value: js.Array[String]): Self = StObject.set(x, "decoratorPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorPathsVarargs(value: String*): Self = StObject.set(x, "decoratorPaths", js.Array(value :_*))
    
    @scala.inline
    def setDecoratorToPreload(value: Double): Self = StObject.set(x, "decoratorToPreload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorToPreloadNull: Self = StObject.set(x, "decoratorToPreload", null)
    
    @scala.inline
    def setExtraCss(value: js.Array[String]): Self = StObject.set(x, "extraCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraCssVarargs(value: String*): Self = StObject.set(x, "extraCss", js.Array(value :_*))
    
    @scala.inline
    def setLayout(value: Default): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPaths(value: js.Array[String]): Self = StObject.set(x, "panelPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPathsVarargs(value: String*): Self = StObject.set(x, "panelPaths", js.Array(value :_*))
    
    @scala.inline
    def setSvgDirs(value: js.Array[String]): Self = StObject.set(x, "svgDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgDirsVarargs(value: String*): Self = StObject.set(x, "svgDirs", js.Array(value :_*))
    
    @scala.inline
    def setVisualizerDescriptors(value: js.Array[String]): Self = StObject.set(x, "visualizerDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualizerDescriptorsVarargs(value: String*): Self = StObject.set(x, "visualizerDescriptors", js.Array(value :_*))
  }
}
