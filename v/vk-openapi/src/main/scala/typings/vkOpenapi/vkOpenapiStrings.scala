package typings.vkOpenapi

import typings.vkOpenapi.vk.OpenAPI.Goal.GoalEvent
import typings.vkOpenapi.vk.OpenAPI.Observer.ObserverEvent
import typings.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent
import typings.vkOpenapi.vk.OpenAPI.Widgets.OnCanNotWriteReason
import typings.vkOpenapi.vk.OpenAPI.Widgets.RecommendedSort
import typings.vkOpenapi.vk.OpenAPI.Widgets.RecommendedTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vkOpenapiStrings {
  
  @js.native
  sealed trait add_payment_info
    extends StObject
       with GoalEvent
       with ProductEvent
  @scala.inline
  def add_payment_info: add_payment_info = "add_payment_info".asInstanceOf[add_payment_info]
  
  @js.native
  sealed trait add_to_cart
    extends StObject
       with GoalEvent
       with ProductEvent
  @scala.inline
  def add_to_cart: add_to_cart = "add_to_cart".asInstanceOf[add_to_cart]
  
  @js.native
  sealed trait add_to_wishlist
    extends StObject
       with GoalEvent
       with ProductEvent
  @scala.inline
  def add_to_wishlist: add_to_wishlist = "add_to_wishlist".asInstanceOf[add_to_wishlist]
  
  @js.native
  sealed trait authDotlogin
    extends StObject
       with ObserverEvent
  @scala.inline
  def authDotlogin: authDotlogin = "auth.login".asInstanceOf[authDotlogin]
  
  @js.native
  sealed trait authDotlogout
    extends StObject
       with ObserverEvent
  @scala.inline
  def authDotlogout: authDotlogout = "auth.logout".asInstanceOf[authDotlogout]
  
  @js.native
  sealed trait authDotsessionChange
    extends StObject
       with ObserverEvent
  @scala.inline
  def authDotsessionChange: authDotsessionChange = "auth.sessionChange".asInstanceOf[authDotsessionChange]
  
  @js.native
  sealed trait authDotstatusChange
    extends StObject
       with ObserverEvent
  @scala.inline
  def authDotstatusChange: authDotstatusChange = "auth.statusChange".asInstanceOf[authDotstatusChange]
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait blank
    extends StObject
       with RecommendedTarget
  @scala.inline
  def blank: blank = "blank".asInstanceOf[blank]
  
  @js.native
  sealed trait button extends StObject
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait cant_write
    extends StObject
       with OnCanNotWriteReason
  @scala.inline
  def cant_write: cant_write = "cant_write".asInstanceOf[cant_write]
  
  @js.native
  sealed trait complete_registration
    extends StObject
       with GoalEvent
  @scala.inline
  def complete_registration: complete_registration = "complete_registration".asInstanceOf[complete_registration]
  
  @js.native
  sealed trait connected extends StObject
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait contact
    extends StObject
       with GoalEvent
  @scala.inline
  def contact: contact = "contact".asInstanceOf[contact]
  
  @js.native
  sealed trait conversion
    extends StObject
       with GoalEvent
  @scala.inline
  def conversion: conversion = "conversion".asInstanceOf[conversion]
  
  @js.native
  sealed trait customize_product
    extends StObject
       with GoalEvent
  @scala.inline
  def customize_product: customize_product = "customize_product".asInstanceOf[customize_product]
  
  @js.native
  sealed trait day extends StObject
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait disabled_messages
    extends StObject
       with OnCanNotWriteReason
  @scala.inline
  def disabled_messages: disabled_messages = "disabled_messages".asInstanceOf[disabled_messages]
  
  @js.native
  sealed trait donate
    extends StObject
       with GoalEvent
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait find_location
    extends StObject
       with GoalEvent
  @scala.inline
  def find_location: find_location = "find_location".asInstanceOf[find_location]
  
  @js.native
  sealed trait friend_likes
    extends StObject
       with RecommendedSort
  @scala.inline
  def friend_likes: friend_likes = "friend_likes".asInstanceOf[friend_likes]
  
  @js.native
  sealed trait full extends StObject
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait init_checkout
    extends StObject
       with ProductEvent
  @scala.inline
  def init_checkout: init_checkout = "init_checkout".asInstanceOf[init_checkout]
  
  @js.native
  sealed trait initiate_checkout
    extends StObject
       with GoalEvent
  @scala.inline
  def initiate_checkout: initiate_checkout = "initiate_checkout".asInstanceOf[initiate_checkout]
  
  @js.native
  sealed trait lead
    extends StObject
       with GoalEvent
  @scala.inline
  def lead: lead = "lead".asInstanceOf[lead]
  
  @js.native
  sealed trait likes
    extends StObject
       with RecommendedSort
  @scala.inline
  def likes: likes = "likes".asInstanceOf[likes]
  
  @js.native
  sealed trait mini extends StObject
  @scala.inline
  def mini: mini = "mini".asInstanceOf[mini]
  
  @js.native
  sealed trait month extends StObject
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait no_access
    extends StObject
       with OnCanNotWriteReason
  @scala.inline
  def no_access: no_access = "no_access".asInstanceOf[no_access]
  
  @js.native
  sealed trait not_authorized extends StObject
  @scala.inline
  def not_authorized: not_authorized = "not_authorized".asInstanceOf[not_authorized]
  
  @js.native
  sealed trait offline
    extends StObject
       with OnCanNotWriteReason
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait page_view
    extends StObject
       with GoalEvent
  @scala.inline
  def page_view: page_view = "page_view".asInstanceOf[page_view]
  
  @js.native
  sealed trait parent
    extends StObject
       with RecommendedTarget
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait purchase
    extends StObject
       with GoalEvent
       with ProductEvent
  @scala.inline
  def purchase: purchase = "purchase".asInstanceOf[purchase]
  
  @js.native
  sealed trait remove_from_cart
    extends StObject
       with ProductEvent
  @scala.inline
  def remove_from_cart: remove_from_cart = "remove_from_cart".asInstanceOf[remove_from_cart]
  
  @js.native
  sealed trait remove_from_wishlist
    extends StObject
       with ProductEvent
  @scala.inline
  def remove_from_wishlist: remove_from_wishlist = "remove_from_wishlist".asInstanceOf[remove_from_wishlist]
  
  @js.native
  sealed trait schedule
    extends StObject
       with GoalEvent
  @scala.inline
  def schedule: schedule = "schedule".asInstanceOf[schedule]
  
  @js.native
  sealed trait search
    extends StObject
       with GoalEvent
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait start_trial
    extends StObject
       with GoalEvent
  @scala.inline
  def start_trial: start_trial = "start_trial".asInstanceOf[start_trial]
  
  @js.native
  sealed trait submit_application
    extends StObject
       with GoalEvent
  @scala.inline
  def submit_application: submit_application = "submit_application".asInstanceOf[submit_application]
  
  @js.native
  sealed trait subscribe
    extends StObject
       with GoalEvent
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait top
    extends StObject
       with RecommendedTarget
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait unknown extends StObject
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait vertical extends StObject
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait view_category
    extends StObject
       with ProductEvent
  @scala.inline
  def view_category: view_category = "view_category".asInstanceOf[view_category]
  
  @js.native
  sealed trait view_content
    extends StObject
       with GoalEvent
  @scala.inline
  def view_content: view_content = "view_content".asInstanceOf[view_content]
  
  @js.native
  sealed trait view_home
    extends StObject
       with ProductEvent
  @scala.inline
  def view_home: view_home = "view_home".asInstanceOf[view_home]
  
  @js.native
  sealed trait view_other
    extends StObject
       with ProductEvent
  @scala.inline
  def view_other: view_other = "view_other".asInstanceOf[view_other]
  
  @js.native
  sealed trait view_product
    extends StObject
       with ProductEvent
  @scala.inline
  def view_product: view_product = "view_product".asInstanceOf[view_product]
  
  @js.native
  sealed trait view_search
    extends StObject
       with ProductEvent
  @scala.inline
  def view_search: view_search = "view_search".asInstanceOf[view_search]
  
  @js.native
  sealed trait week extends StObject
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait widgetsDotallowMessagesFromCommunityDotallowed
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotallowMessagesFromCommunityDotallowed: widgetsDotallowMessagesFromCommunityDotallowed = "widgets.allowMessagesFromCommunity.allowed".asInstanceOf[widgetsDotallowMessagesFromCommunityDotallowed]
  
  @js.native
  sealed trait widgetsDotallowMessagesFromCommunityDotdenied
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotallowMessagesFromCommunityDotdenied: widgetsDotallowMessagesFromCommunityDotdenied = "widgets.allowMessagesFromCommunity.denied".asInstanceOf[widgetsDotallowMessagesFromCommunityDotdenied]
  
  @js.native
  sealed trait widgetsDotcommentsDotdelete_comment
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotcommentsDotdelete_comment: widgetsDotcommentsDotdelete_comment = "widgets.comments.delete_comment".asInstanceOf[widgetsDotcommentsDotdelete_comment]
  
  @js.native
  sealed trait widgetsDotcommentsDotnew_comment
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotcommentsDotnew_comment: widgetsDotcommentsDotnew_comment = "widgets.comments.new_comment".asInstanceOf[widgetsDotcommentsDotnew_comment]
  
  @js.native
  sealed trait widgetsDotgroupsDotjoined
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotgroupsDotjoined: widgetsDotgroupsDotjoined = "widgets.groups.joined".asInstanceOf[widgetsDotgroupsDotjoined]
  
  @js.native
  sealed trait widgetsDotgroupsDotleaved
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotgroupsDotleaved: widgetsDotgroupsDotleaved = "widgets.groups.leaved".asInstanceOf[widgetsDotgroupsDotleaved]
  
  @js.native
  sealed trait widgetsDotlikeDotliked
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotlikeDotliked: widgetsDotlikeDotliked = "widgets.like.liked".asInstanceOf[widgetsDotlikeDotliked]
  
  @js.native
  sealed trait widgetsDotlikeDotshared
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotlikeDotshared: widgetsDotlikeDotshared = "widgets.like.shared".asInstanceOf[widgetsDotlikeDotshared]
  
  @js.native
  sealed trait widgetsDotlikeDotunliked
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotlikeDotunliked: widgetsDotlikeDotunliked = "widgets.like.unliked".asInstanceOf[widgetsDotlikeDotunliked]
  
  @js.native
  sealed trait widgetsDotlikeDotunshared
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotlikeDotunshared: widgetsDotlikeDotunshared = "widgets.like.unshared".asInstanceOf[widgetsDotlikeDotunshared]
  
  @js.native
  sealed trait widgetsDotsubscribed
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotsubscribed: widgetsDotsubscribed = "widgets.subscribed".asInstanceOf[widgetsDotsubscribed]
  
  @js.native
  sealed trait widgetsDotunsubscribed
    extends StObject
       with ObserverEvent
  @scala.inline
  def widgetsDotunsubscribed: widgetsDotunsubscribed = "widgets.unsubscribed".asInstanceOf[widgetsDotunsubscribed]
}
