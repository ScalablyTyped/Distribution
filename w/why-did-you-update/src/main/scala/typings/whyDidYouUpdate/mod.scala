package typings.whyDidYouUpdate

import typings.std.RegExp
import typings.whyDidYouUpdate.anon.Typeofreact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("why-did-you-update", "whyDidYouUpdate")
  @js.native
  def whyDidYouUpdate(react: Typeofreact): Unit = js.native
  @JSImport("why-did-you-update", "whyDidYouUpdate")
  @js.native
  def whyDidYouUpdate(react: Typeofreact, options: Options): Unit = js.native
  
  @js.native
  trait Diffs extends StObject {
    
    var name: String = js.native
    
    var next: js.Any = js.native
    
    var prev: js.Any = js.native
    
    var `type`: js.Any = js.native
  }
  object Diffs {
    
    @scala.inline
    def apply(name: String, next: js.Any, prev: js.Any, `type`: js.Any): Diffs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diffs]
    }
    
    @scala.inline
    implicit class DiffsMutableBuilder[Self <: Diffs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: js.Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: js.Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var collapseComponentGroups: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[RegExp] = js.native
    
    var groupByComment: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[RegExp] = js.native
    
    var notifier: js.UndefOr[
        js.Function4[
          /* groupByComponent */ Boolean, 
          /* collapseComponentGroups */ Boolean, 
          /* displayName */ String, 
          /* diffs */ js.Array[Diffs], 
          Unit
        ]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseComponentGroups(value: Boolean): Self = StObject.set(x, "collapseComponentGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseComponentGroupsUndefined: Self = StObject.set(x, "collapseComponentGroups", js.undefined)
      
      @scala.inline
      def setExclude(value: RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setGroupByComment(value: Boolean): Self = StObject.set(x, "groupByComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByCommentUndefined: Self = StObject.set(x, "groupByComment", js.undefined)
      
      @scala.inline
      def setInclude(value: RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setNotifier(
        value: (/* groupByComponent */ Boolean, /* collapseComponentGroups */ Boolean, /* displayName */ String, /* diffs */ js.Array[Diffs]) => Unit
      ): Self = StObject.set(x, "notifier", js.Any.fromFunction4(value))
      
      @scala.inline
      def setNotifierUndefined: Self = StObject.set(x, "notifier", js.undefined)
    }
  }
}
