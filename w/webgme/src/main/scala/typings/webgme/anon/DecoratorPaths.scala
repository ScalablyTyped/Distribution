package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorPaths extends js.Object {
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
  implicit class DecoratorPathsOps[Self <: DecoratorPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecoratorPathsVarargs(value: String*): Self = this.set("decoratorPaths", js.Array(value :_*))
    @scala.inline
    def setDecoratorPaths(value: js.Array[String]): Self = this.set("decoratorPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraCssVarargs(value: String*): Self = this.set("extraCss", js.Array(value :_*))
    @scala.inline
    def setExtraCss(value: js.Array[String]): Self = this.set("extraCss", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: Default): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanelPathsVarargs(value: String*): Self = this.set("panelPaths", js.Array(value :_*))
    @scala.inline
    def setPanelPaths(value: js.Array[String]): Self = this.set("panelPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvgDirsVarargs(value: String*): Self = this.set("svgDirs", js.Array(value :_*))
    @scala.inline
    def setSvgDirs(value: js.Array[String]): Self = this.set("svgDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisualizerDescriptorsVarargs(value: String*): Self = this.set("visualizerDescriptors", js.Array(value :_*))
    @scala.inline
    def setVisualizerDescriptors(value: js.Array[String]): Self = this.set("visualizerDescriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorToPreload(value: Double): Self = this.set("decoratorToPreload", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorToPreloadNull: Self = this.set("decoratorToPreload", null)
  }
  
}

