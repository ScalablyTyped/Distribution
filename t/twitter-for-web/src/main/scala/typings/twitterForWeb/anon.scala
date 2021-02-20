package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import typings.twitterForWeb.twitterForWebStrings.list
import typings.twitterForWeb.twitterForWebStrings.profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Id extends TwitterTimelineWidgetListDataSource {
    
    var id: String = js.native
    
    var sourceType: list = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, sourceType: list): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceType(value: list): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OwnerScreenName extends TwitterTimelineWidgetListDataSource {
    
    var ownerScreenName: String = js.native
    
    var slug: String = js.native
    
    var sourceType: list = js.native
  }
  object OwnerScreenName {
    
    @scala.inline
    def apply(ownerScreenName: String, slug: String, sourceType: list): OwnerScreenName = {
      val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[OwnerScreenName]
    }
    
    @scala.inline
    implicit class OwnerScreenNameMutableBuilder[Self <: OwnerScreenName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwnerScreenName(value: String): Self = StObject.set(x, "ownerScreenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceType(value: list): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScreenName extends TwitterTimelineWidgetProfileDataSource {
    
    var screenName: String = js.native
    
    var sourceType: profile = js.native
  }
  object ScreenName {
    
    @scala.inline
    def apply(screenName: String, sourceType: profile): ScreenName = {
      val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenName]
    }
    
    @scala.inline
    implicit class ScreenNameMutableBuilder[Self <: ScreenName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceType(value: profile): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScreenNameSourceType extends TwitterTimelineWidgetLikesDataSource {
    
    var screenName: String = js.native
    
    var sourceType: likes = js.native
  }
  object ScreenNameSourceType {
    
    @scala.inline
    def apply(screenName: String, sourceType: likes): ScreenNameSourceType = {
      val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenNameSourceType]
    }
    
    @scala.inline
    implicit class ScreenNameSourceTypeMutableBuilder[Self <: ScreenNameSourceType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceType(value: likes): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceType extends TwitterTimelineWidgetProfileDataSource {
    
    var sourceType: profile = js.native
    
    var userId: String = js.native
  }
  object SourceType {
    
    @scala.inline
    def apply(sourceType: profile, userId: String): SourceType = {
      val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceType]
    }
    
    @scala.inline
    implicit class SourceTypeMutableBuilder[Self <: SourceType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceType(value: profile): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserId extends TwitterTimelineWidgetLikesDataSource {
    
    var sourceType: likes = js.native
    
    var userId: String = js.native
  }
  object UserId {
    
    @scala.inline
    def apply(sourceType: likes, userId: String): UserId = {
      val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserId]
    }
    
    @scala.inline
    implicit class UserIdMutableBuilder[Self <: UserId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceType(value: likes): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
