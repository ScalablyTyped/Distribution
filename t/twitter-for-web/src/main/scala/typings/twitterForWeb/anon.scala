package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.likes
import typings.twitterForWeb.twitterForWebStrings.list
import typings.twitterForWeb.twitterForWebStrings.profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id
    extends StObject
       with TwitterTimelineWidgetListDataSource {
    
    var id: String
    
    var sourceType: list
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "list")
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
  
  trait OwnerScreenName
    extends StObject
       with TwitterTimelineWidgetListDataSource {
    
    var ownerScreenName: String
    
    var slug: String
    
    var sourceType: list
  }
  object OwnerScreenName {
    
    @scala.inline
    def apply(ownerScreenName: String, slug: String): OwnerScreenName = {
      val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = "list")
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
  
  trait ScreenName
    extends StObject
       with TwitterTimelineWidgetProfileDataSource {
    
    var screenName: String
    
    var sourceType: profile
  }
  object ScreenName {
    
    @scala.inline
    def apply(screenName: String): ScreenName = {
      val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "profile")
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
  
  trait ScreenNameSourceType
    extends StObject
       with TwitterTimelineWidgetLikesDataSource {
    
    var screenName: String
    
    var sourceType: likes
  }
  object ScreenNameSourceType {
    
    @scala.inline
    def apply(screenName: String): ScreenNameSourceType = {
      val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "likes")
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
  
  trait SourceType
    extends StObject
       with TwitterTimelineWidgetProfileDataSource {
    
    var sourceType: profile
    
    var userId: String
  }
  object SourceType {
    
    @scala.inline
    def apply(userId: String): SourceType = {
      val __obj = js.Dynamic.literal(sourceType = "profile", userId = userId.asInstanceOf[js.Any])
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
  
  trait UserId
    extends StObject
       with TwitterTimelineWidgetLikesDataSource {
    
    var sourceType: likes
    
    var userId: String
  }
  object UserId {
    
    @scala.inline
    def apply(userId: String): UserId = {
      val __obj = js.Dynamic.literal(sourceType = "likes", userId = userId.asInstanceOf[js.Any])
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
