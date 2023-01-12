package typings.whyDidYouUpdate

import typings.whyDidYouUpdate.anon.Typeofreact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("why-did-you-update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def whyDidYouUpdate(react: Typeofreact): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("whyDidYouUpdate")(react.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def whyDidYouUpdate(react: Typeofreact, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("whyDidYouUpdate")(react.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Diffs extends StObject {
    
    var name: String
    
    var next: Any
    
    var prev: Any
    
    var `type`: Any
  }
  object Diffs {
    
    inline def apply(name: String, next: Any, prev: Any, `type`: Any): Diffs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diffs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Diffs] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var collapseComponentGroups: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.RegExp] = js.undefined
    
    var groupByComment: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.RegExp] = js.undefined
    
    var notifier: js.UndefOr[
        js.Function4[
          /* groupByComponent */ Boolean, 
          /* collapseComponentGroups */ Boolean, 
          /* displayName */ String, 
          /* diffs */ js.Array[Diffs], 
          Unit
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCollapseComponentGroups(value: Boolean): Self = StObject.set(x, "collapseComponentGroups", value.asInstanceOf[js.Any])
      
      inline def setCollapseComponentGroupsUndefined: Self = StObject.set(x, "collapseComponentGroups", js.undefined)
      
      inline def setExclude(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setGroupByComment(value: Boolean): Self = StObject.set(x, "groupByComment", value.asInstanceOf[js.Any])
      
      inline def setGroupByCommentUndefined: Self = StObject.set(x, "groupByComment", js.undefined)
      
      inline def setInclude(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setNotifier(
        value: (/* groupByComponent */ Boolean, /* collapseComponentGroups */ Boolean, /* displayName */ String, /* diffs */ js.Array[Diffs]) => Unit
      ): Self = StObject.set(x, "notifier", js.Any.fromFunction4(value))
      
      inline def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
    }
  }
}
