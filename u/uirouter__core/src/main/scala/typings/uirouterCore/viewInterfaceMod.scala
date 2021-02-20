package typings.uirouterCore

import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.stateInterfaceMod.ViewDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewInterfaceMod {
  
  @js.native
  trait ActiveUIView extends StObject {
    
    /** type of framework, e.g., "ng1" or "ng2" */
    @JSName("$type")
    var $type: String = js.native
    
    /** The ViewConfig that is currently loaded into the ui-view */
    var config: ViewConfig = js.native
    
    /** A callback that should apply a ViewConfig (or clear the ui-view, if config is undefined) */
    def configUpdated(config: ViewConfig): Unit = js.native
    
    /** The state context in which the ui-view tag was created. */
    var creationContext: ViewContext = js.native
    
    /** The ui-view's fully qualified name */
    var fqn: String = js.native
    
    /** An auto-incremented id */
    var id: Double = js.native
    
    /** The ui-view short name */
    var name: String = js.native
  }
  object ActiveUIView {
    
    @scala.inline
    def apply(
      $type: String,
      config: ViewConfig,
      configUpdated: ViewConfig => Unit,
      creationContext: ViewContext,
      fqn: String,
      id: Double,
      name: String
    ): ActiveUIView = {
      val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configUpdated = js.Any.fromFunction1(configUpdated), creationContext = creationContext.asInstanceOf[js.Any], fqn = fqn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveUIView]
    }
    
    @scala.inline
    implicit class ActiveUIViewMutableBuilder[Self <: ActiveUIView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$type(value: String): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: ViewConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUpdated(value: ViewConfig => Unit): Self = StObject.set(x, "configUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreationContext(value: ViewContext): Self = StObject.set(x, "creationContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFqn(value: String): Self = StObject.set(x, "fqn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewConfig extends StObject {
    
    @JSName("$id")
    var $id: Double = js.native
    
    /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
    def load(): js.Promise[ViewConfig] = js.native
    
    var loaded: Boolean = js.native
    
    /** The node the ViewConfig is bound to */
    var path: js.Array[PathNode] = js.native
    
    /** The normalized view declaration from [[State.views]] */
    var viewDecl: ViewDeclaration = js.native
  }
  object ViewConfig {
    
    @scala.inline
    def apply(
      $id: Double,
      load: () => js.Promise[ViewConfig],
      loaded: Boolean,
      path: js.Array[PathNode],
      viewDecl: ViewDeclaration
    ): ViewConfig = {
      val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loaded = loaded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], viewDecl = viewDecl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewConfig]
    }
    
    @scala.inline
    implicit class ViewConfigMutableBuilder[Self <: ViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$id(value: Double): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoad(value: () => js.Promise[ViewConfig]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[PathNode]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: PathNode*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setViewDecl(value: ViewDeclaration): Self = StObject.set(x, "viewDecl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewContext extends StObject {
    
    var name: String = js.native
    
    var parent: ViewContext = js.native
  }
  object ViewContext {
    
    @scala.inline
    def apply(name: String, parent: ViewContext): ViewContext = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewContext]
    }
    
    @scala.inline
    implicit class ViewContextMutableBuilder[Self <: ViewContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: ViewContext): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
}
