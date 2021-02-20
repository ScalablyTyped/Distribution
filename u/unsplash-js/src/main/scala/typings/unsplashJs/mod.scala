package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.anon.AccessKey
import typings.unsplashJs.anon.Bio
import typings.unsplashJs.anon.Body
import typings.unsplashJs.anon.C
import typings.unsplashJs.anon.Links
import typings.unsplashJs.anon.OrientationOrientation
import typings.unsplashJs.mod.UnsplashApi.Auth
import typings.unsplashJs.mod.UnsplashApi.Collections
import typings.unsplashJs.mod.UnsplashApi.CurrentUser
import typings.unsplashJs.mod.UnsplashApi.Photo
import typings.unsplashJs.mod.UnsplashApi.Search
import typings.unsplashJs.mod.UnsplashApi.Stats
import typings.unsplashJs.mod.UnsplashApi.Users
import typings.unsplashJs.unsplashJsStrings.days
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unsplash-js", JSImport.Default)
  @js.native
  class default protected () extends Unsplash {
    def this(options: AccessKey) = this()
  }
  
  @JSImport("unsplash-js", "toJson")
  @js.native
  def toJson(response: js.Any): js.Any = js.native
  
  type CollectionIds = js.Array[Double | String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.high
    - typings.unsplashJs.unsplashJsStrings.low
  */
  trait ContentSafety extends StObject
  object ContentSafety {
    
    @scala.inline
    def high: typings.unsplashJs.unsplashJsStrings.high = "high".asInstanceOf[typings.unsplashJs.unsplashJsStrings.high]
    
    @scala.inline
    def low: typings.unsplashJs.unsplashJsStrings.low = "low".asInstanceOf[typings.unsplashJs.unsplashJsStrings.low]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.af
    - typings.unsplashJs.unsplashJsStrings.am
    - typings.unsplashJs.unsplashJsStrings.ar
    - typings.unsplashJs.unsplashJsStrings.az
    - typings.unsplashJs.unsplashJsStrings.be
    - typings.unsplashJs.unsplashJsStrings.bg
    - typings.unsplashJs.unsplashJsStrings.bn
    - typings.unsplashJs.unsplashJsStrings.bs
    - typings.unsplashJs.unsplashJsStrings.ca
    - typings.unsplashJs.unsplashJsStrings.ceb
    - typings.unsplashJs.unsplashJsStrings.co
    - typings.unsplashJs.unsplashJsStrings.cs
    - typings.unsplashJs.unsplashJsStrings.cy
    - typings.unsplashJs.unsplashJsStrings.da
    - typings.unsplashJs.unsplashJsStrings.de
    - typings.unsplashJs.unsplashJsStrings.el
    - typings.unsplashJs.unsplashJsStrings.en
    - typings.unsplashJs.unsplashJsStrings.eo
    - typings.unsplashJs.unsplashJsStrings.es
    - typings.unsplashJs.unsplashJsStrings.et
    - typings.unsplashJs.unsplashJsStrings.eu
    - typings.unsplashJs.unsplashJsStrings.fa
    - typings.unsplashJs.unsplashJsStrings.fi
    - typings.unsplashJs.unsplashJsStrings.fr
    - typings.unsplashJs.unsplashJsStrings.fy
    - typings.unsplashJs.unsplashJsStrings.ga
    - typings.unsplashJs.unsplashJsStrings.gd
    - typings.unsplashJs.unsplashJsStrings.gl
    - typings.unsplashJs.unsplashJsStrings.gu
    - typings.unsplashJs.unsplashJsStrings.ha
    - typings.unsplashJs.unsplashJsStrings.haw
    - typings.unsplashJs.unsplashJsStrings.hi
    - typings.unsplashJs.unsplashJsStrings.hmn
    - typings.unsplashJs.unsplashJsStrings.hr
    - typings.unsplashJs.unsplashJsStrings.ht
    - typings.unsplashJs.unsplashJsStrings.hu
    - typings.unsplashJs.unsplashJsStrings.hy
    - typings.unsplashJs.unsplashJsStrings.id
    - typings.unsplashJs.unsplashJsStrings.ig
    - typings.unsplashJs.unsplashJsStrings.is
    - typings.unsplashJs.unsplashJsStrings.it
    - typings.unsplashJs.unsplashJsStrings.iw
    - typings.unsplashJs.unsplashJsStrings.ja
    - typings.unsplashJs.unsplashJsStrings.jw
    - typings.unsplashJs.unsplashJsStrings.ka
    - typings.unsplashJs.unsplashJsStrings.kk
    - typings.unsplashJs.unsplashJsStrings.km
    - typings.unsplashJs.unsplashJsStrings.kn
    - typings.unsplashJs.unsplashJsStrings.ko
    - typings.unsplashJs.unsplashJsStrings.ku
    - typings.unsplashJs.unsplashJsStrings.ky
    - typings.unsplashJs.unsplashJsStrings.la
    - typings.unsplashJs.unsplashJsStrings.lb
    - typings.unsplashJs.unsplashJsStrings.lo
    - typings.unsplashJs.unsplashJsStrings.lt
    - typings.unsplashJs.unsplashJsStrings.lv
    - typings.unsplashJs.unsplashJsStrings.mg
    - typings.unsplashJs.unsplashJsStrings.mi
    - typings.unsplashJs.unsplashJsStrings.mk
    - typings.unsplashJs.unsplashJsStrings.ml
    - typings.unsplashJs.unsplashJsStrings.mn
    - typings.unsplashJs.unsplashJsStrings.mr
    - typings.unsplashJs.unsplashJsStrings.ms
    - typings.unsplashJs.unsplashJsStrings.mt
    - typings.unsplashJs.unsplashJsStrings.my
    - typings.unsplashJs.unsplashJsStrings.ne
    - typings.unsplashJs.unsplashJsStrings.nl
    - typings.unsplashJs.unsplashJsStrings.no
    - typings.unsplashJs.unsplashJsStrings.ny
    - typings.unsplashJs.unsplashJsStrings.or
    - typings.unsplashJs.unsplashJsStrings.pa
    - typings.unsplashJs.unsplashJsStrings.pl
    - typings.unsplashJs.unsplashJsStrings.ps
    - typings.unsplashJs.unsplashJsStrings.pt
    - typings.unsplashJs.unsplashJsStrings.ro
    - typings.unsplashJs.unsplashJsStrings.ru
    - typings.unsplashJs.unsplashJsStrings.rw
    - typings.unsplashJs.unsplashJsStrings.sd
    - typings.unsplashJs.unsplashJsStrings.si
    - typings.unsplashJs.unsplashJsStrings.sk
    - typings.unsplashJs.unsplashJsStrings.sl
    - typings.unsplashJs.unsplashJsStrings.sm
    - typings.unsplashJs.unsplashJsStrings.sn
    - typings.unsplashJs.unsplashJsStrings.so
    - typings.unsplashJs.unsplashJsStrings.sq
    - typings.unsplashJs.unsplashJsStrings.sr
    - typings.unsplashJs.unsplashJsStrings.st
    - typings.unsplashJs.unsplashJsStrings.su
    - typings.unsplashJs.unsplashJsStrings.sv
    - typings.unsplashJs.unsplashJsStrings.sw
    - typings.unsplashJs.unsplashJsStrings.ta
    - typings.unsplashJs.unsplashJsStrings.te
    - typings.unsplashJs.unsplashJsStrings.tg
    - typings.unsplashJs.unsplashJsStrings.th
    - typings.unsplashJs.unsplashJsStrings.tk
    - typings.unsplashJs.unsplashJsStrings.tl
    - typings.unsplashJs.unsplashJsStrings.tr
    - typings.unsplashJs.unsplashJsStrings.tt
    - typings.unsplashJs.unsplashJsStrings.ug
    - typings.unsplashJs.unsplashJsStrings.uk
    - typings.unsplashJs.unsplashJsStrings.ur
    - typings.unsplashJs.unsplashJsStrings.uz
    - typings.unsplashJs.unsplashJsStrings.vi
    - typings.unsplashJs.unsplashJsStrings.xh
    - typings.unsplashJs.unsplashJsStrings.yi
    - typings.unsplashJs.unsplashJsStrings.yo
    - typings.unsplashJs.unsplashJsStrings.zh
    - typings.unsplashJs.unsplashJsStrings.`zh-TW`
    - typings.unsplashJs.unsplashJsStrings.zu
  */
  trait Languages extends StObject
  object Languages {
    
    @scala.inline
    def af: typings.unsplashJs.unsplashJsStrings.af = "af".asInstanceOf[typings.unsplashJs.unsplashJsStrings.af]
    
    @scala.inline
    def am: typings.unsplashJs.unsplashJsStrings.am = "am".asInstanceOf[typings.unsplashJs.unsplashJsStrings.am]
    
    @scala.inline
    def ar: typings.unsplashJs.unsplashJsStrings.ar = "ar".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ar]
    
    @scala.inline
    def az: typings.unsplashJs.unsplashJsStrings.az = "az".asInstanceOf[typings.unsplashJs.unsplashJsStrings.az]
    
    @scala.inline
    def be: typings.unsplashJs.unsplashJsStrings.be = "be".asInstanceOf[typings.unsplashJs.unsplashJsStrings.be]
    
    @scala.inline
    def bg: typings.unsplashJs.unsplashJsStrings.bg = "bg".asInstanceOf[typings.unsplashJs.unsplashJsStrings.bg]
    
    @scala.inline
    def bn: typings.unsplashJs.unsplashJsStrings.bn = "bn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.bn]
    
    @scala.inline
    def bs: typings.unsplashJs.unsplashJsStrings.bs = "bs".asInstanceOf[typings.unsplashJs.unsplashJsStrings.bs]
    
    @scala.inline
    def ca: typings.unsplashJs.unsplashJsStrings.ca = "ca".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ca]
    
    @scala.inline
    def ceb: typings.unsplashJs.unsplashJsStrings.ceb = "ceb".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ceb]
    
    @scala.inline
    def co: typings.unsplashJs.unsplashJsStrings.co = "co".asInstanceOf[typings.unsplashJs.unsplashJsStrings.co]
    
    @scala.inline
    def cs: typings.unsplashJs.unsplashJsStrings.cs = "cs".asInstanceOf[typings.unsplashJs.unsplashJsStrings.cs]
    
    @scala.inline
    def cy: typings.unsplashJs.unsplashJsStrings.cy = "cy".asInstanceOf[typings.unsplashJs.unsplashJsStrings.cy]
    
    @scala.inline
    def da: typings.unsplashJs.unsplashJsStrings.da = "da".asInstanceOf[typings.unsplashJs.unsplashJsStrings.da]
    
    @scala.inline
    def de: typings.unsplashJs.unsplashJsStrings.de = "de".asInstanceOf[typings.unsplashJs.unsplashJsStrings.de]
    
    @scala.inline
    def el: typings.unsplashJs.unsplashJsStrings.el = "el".asInstanceOf[typings.unsplashJs.unsplashJsStrings.el]
    
    @scala.inline
    def en: typings.unsplashJs.unsplashJsStrings.en = "en".asInstanceOf[typings.unsplashJs.unsplashJsStrings.en]
    
    @scala.inline
    def eo: typings.unsplashJs.unsplashJsStrings.eo = "eo".asInstanceOf[typings.unsplashJs.unsplashJsStrings.eo]
    
    @scala.inline
    def es: typings.unsplashJs.unsplashJsStrings.es = "es".asInstanceOf[typings.unsplashJs.unsplashJsStrings.es]
    
    @scala.inline
    def et: typings.unsplashJs.unsplashJsStrings.et = "et".asInstanceOf[typings.unsplashJs.unsplashJsStrings.et]
    
    @scala.inline
    def eu: typings.unsplashJs.unsplashJsStrings.eu = "eu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.eu]
    
    @scala.inline
    def fa: typings.unsplashJs.unsplashJsStrings.fa = "fa".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fa]
    
    @scala.inline
    def fi: typings.unsplashJs.unsplashJsStrings.fi = "fi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fi]
    
    @scala.inline
    def fr: typings.unsplashJs.unsplashJsStrings.fr = "fr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fr]
    
    @scala.inline
    def fy: typings.unsplashJs.unsplashJsStrings.fy = "fy".asInstanceOf[typings.unsplashJs.unsplashJsStrings.fy]
    
    @scala.inline
    def ga: typings.unsplashJs.unsplashJsStrings.ga = "ga".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ga]
    
    @scala.inline
    def gd: typings.unsplashJs.unsplashJsStrings.gd = "gd".asInstanceOf[typings.unsplashJs.unsplashJsStrings.gd]
    
    @scala.inline
    def gl: typings.unsplashJs.unsplashJsStrings.gl = "gl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.gl]
    
    @scala.inline
    def gu: typings.unsplashJs.unsplashJsStrings.gu = "gu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.gu]
    
    @scala.inline
    def ha: typings.unsplashJs.unsplashJsStrings.ha = "ha".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ha]
    
    @scala.inline
    def haw: typings.unsplashJs.unsplashJsStrings.haw = "haw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.haw]
    
    @scala.inline
    def hi: typings.unsplashJs.unsplashJsStrings.hi = "hi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hi]
    
    @scala.inline
    def hmn: typings.unsplashJs.unsplashJsStrings.hmn = "hmn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hmn]
    
    @scala.inline
    def hr: typings.unsplashJs.unsplashJsStrings.hr = "hr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hr]
    
    @scala.inline
    def ht: typings.unsplashJs.unsplashJsStrings.ht = "ht".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ht]
    
    @scala.inline
    def hu: typings.unsplashJs.unsplashJsStrings.hu = "hu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hu]
    
    @scala.inline
    def hy: typings.unsplashJs.unsplashJsStrings.hy = "hy".asInstanceOf[typings.unsplashJs.unsplashJsStrings.hy]
    
    @scala.inline
    def id: typings.unsplashJs.unsplashJsStrings.id = "id".asInstanceOf[typings.unsplashJs.unsplashJsStrings.id]
    
    @scala.inline
    def ig: typings.unsplashJs.unsplashJsStrings.ig = "ig".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ig]
    
    @scala.inline
    def is: typings.unsplashJs.unsplashJsStrings.is = "is".asInstanceOf[typings.unsplashJs.unsplashJsStrings.is]
    
    @scala.inline
    def it: typings.unsplashJs.unsplashJsStrings.it = "it".asInstanceOf[typings.unsplashJs.unsplashJsStrings.it]
    
    @scala.inline
    def iw: typings.unsplashJs.unsplashJsStrings.iw = "iw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.iw]
    
    @scala.inline
    def ja: typings.unsplashJs.unsplashJsStrings.ja = "ja".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ja]
    
    @scala.inline
    def jw: typings.unsplashJs.unsplashJsStrings.jw = "jw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.jw]
    
    @scala.inline
    def ka: typings.unsplashJs.unsplashJsStrings.ka = "ka".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ka]
    
    @scala.inline
    def kk: typings.unsplashJs.unsplashJsStrings.kk = "kk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.kk]
    
    @scala.inline
    def km: typings.unsplashJs.unsplashJsStrings.km = "km".asInstanceOf[typings.unsplashJs.unsplashJsStrings.km]
    
    @scala.inline
    def kn: typings.unsplashJs.unsplashJsStrings.kn = "kn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.kn]
    
    @scala.inline
    def ko: typings.unsplashJs.unsplashJsStrings.ko = "ko".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ko]
    
    @scala.inline
    def ku: typings.unsplashJs.unsplashJsStrings.ku = "ku".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ku]
    
    @scala.inline
    def ky: typings.unsplashJs.unsplashJsStrings.ky = "ky".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ky]
    
    @scala.inline
    def la: typings.unsplashJs.unsplashJsStrings.la = "la".asInstanceOf[typings.unsplashJs.unsplashJsStrings.la]
    
    @scala.inline
    def lb: typings.unsplashJs.unsplashJsStrings.lb = "lb".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lb]
    
    @scala.inline
    def lo: typings.unsplashJs.unsplashJsStrings.lo = "lo".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lo]
    
    @scala.inline
    def lt: typings.unsplashJs.unsplashJsStrings.lt = "lt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lt]
    
    @scala.inline
    def lv: typings.unsplashJs.unsplashJsStrings.lv = "lv".asInstanceOf[typings.unsplashJs.unsplashJsStrings.lv]
    
    @scala.inline
    def mg: typings.unsplashJs.unsplashJsStrings.mg = "mg".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mg]
    
    @scala.inline
    def mi: typings.unsplashJs.unsplashJsStrings.mi = "mi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mi]
    
    @scala.inline
    def mk: typings.unsplashJs.unsplashJsStrings.mk = "mk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mk]
    
    @scala.inline
    def ml: typings.unsplashJs.unsplashJsStrings.ml = "ml".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ml]
    
    @scala.inline
    def mn: typings.unsplashJs.unsplashJsStrings.mn = "mn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mn]
    
    @scala.inline
    def mr: typings.unsplashJs.unsplashJsStrings.mr = "mr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mr]
    
    @scala.inline
    def ms: typings.unsplashJs.unsplashJsStrings.ms = "ms".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ms]
    
    @scala.inline
    def mt: typings.unsplashJs.unsplashJsStrings.mt = "mt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.mt]
    
    @scala.inline
    def my: typings.unsplashJs.unsplashJsStrings.my = "my".asInstanceOf[typings.unsplashJs.unsplashJsStrings.my]
    
    @scala.inline
    def ne: typings.unsplashJs.unsplashJsStrings.ne = "ne".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ne]
    
    @scala.inline
    def nl: typings.unsplashJs.unsplashJsStrings.nl = "nl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.nl]
    
    @scala.inline
    def no: typings.unsplashJs.unsplashJsStrings.no = "no".asInstanceOf[typings.unsplashJs.unsplashJsStrings.no]
    
    @scala.inline
    def ny: typings.unsplashJs.unsplashJsStrings.ny = "ny".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ny]
    
    @scala.inline
    def or: typings.unsplashJs.unsplashJsStrings.or = "or".asInstanceOf[typings.unsplashJs.unsplashJsStrings.or]
    
    @scala.inline
    def pa: typings.unsplashJs.unsplashJsStrings.pa = "pa".asInstanceOf[typings.unsplashJs.unsplashJsStrings.pa]
    
    @scala.inline
    def pl: typings.unsplashJs.unsplashJsStrings.pl = "pl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.pl]
    
    @scala.inline
    def ps: typings.unsplashJs.unsplashJsStrings.ps = "ps".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ps]
    
    @scala.inline
    def pt: typings.unsplashJs.unsplashJsStrings.pt = "pt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.pt]
    
    @scala.inline
    def ro: typings.unsplashJs.unsplashJsStrings.ro = "ro".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ro]
    
    @scala.inline
    def ru: typings.unsplashJs.unsplashJsStrings.ru = "ru".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ru]
    
    @scala.inline
    def rw: typings.unsplashJs.unsplashJsStrings.rw = "rw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.rw]
    
    @scala.inline
    def sd: typings.unsplashJs.unsplashJsStrings.sd = "sd".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sd]
    
    @scala.inline
    def si: typings.unsplashJs.unsplashJsStrings.si = "si".asInstanceOf[typings.unsplashJs.unsplashJsStrings.si]
    
    @scala.inline
    def sk: typings.unsplashJs.unsplashJsStrings.sk = "sk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sk]
    
    @scala.inline
    def sl: typings.unsplashJs.unsplashJsStrings.sl = "sl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sl]
    
    @scala.inline
    def sm: typings.unsplashJs.unsplashJsStrings.sm = "sm".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sm]
    
    @scala.inline
    def sn: typings.unsplashJs.unsplashJsStrings.sn = "sn".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sn]
    
    @scala.inline
    def so: typings.unsplashJs.unsplashJsStrings.so = "so".asInstanceOf[typings.unsplashJs.unsplashJsStrings.so]
    
    @scala.inline
    def sq: typings.unsplashJs.unsplashJsStrings.sq = "sq".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sq]
    
    @scala.inline
    def sr: typings.unsplashJs.unsplashJsStrings.sr = "sr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sr]
    
    @scala.inline
    def st: typings.unsplashJs.unsplashJsStrings.st = "st".asInstanceOf[typings.unsplashJs.unsplashJsStrings.st]
    
    @scala.inline
    def su: typings.unsplashJs.unsplashJsStrings.su = "su".asInstanceOf[typings.unsplashJs.unsplashJsStrings.su]
    
    @scala.inline
    def sv: typings.unsplashJs.unsplashJsStrings.sv = "sv".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sv]
    
    @scala.inline
    def sw: typings.unsplashJs.unsplashJsStrings.sw = "sw".asInstanceOf[typings.unsplashJs.unsplashJsStrings.sw]
    
    @scala.inline
    def ta: typings.unsplashJs.unsplashJsStrings.ta = "ta".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ta]
    
    @scala.inline
    def te: typings.unsplashJs.unsplashJsStrings.te = "te".asInstanceOf[typings.unsplashJs.unsplashJsStrings.te]
    
    @scala.inline
    def tg: typings.unsplashJs.unsplashJsStrings.tg = "tg".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tg]
    
    @scala.inline
    def th: typings.unsplashJs.unsplashJsStrings.th = "th".asInstanceOf[typings.unsplashJs.unsplashJsStrings.th]
    
    @scala.inline
    def tk: typings.unsplashJs.unsplashJsStrings.tk = "tk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tk]
    
    @scala.inline
    def tl: typings.unsplashJs.unsplashJsStrings.tl = "tl".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tl]
    
    @scala.inline
    def tr: typings.unsplashJs.unsplashJsStrings.tr = "tr".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tr]
    
    @scala.inline
    def tt: typings.unsplashJs.unsplashJsStrings.tt = "tt".asInstanceOf[typings.unsplashJs.unsplashJsStrings.tt]
    
    @scala.inline
    def ug: typings.unsplashJs.unsplashJsStrings.ug = "ug".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ug]
    
    @scala.inline
    def uk: typings.unsplashJs.unsplashJsStrings.uk = "uk".asInstanceOf[typings.unsplashJs.unsplashJsStrings.uk]
    
    @scala.inline
    def ur: typings.unsplashJs.unsplashJsStrings.ur = "ur".asInstanceOf[typings.unsplashJs.unsplashJsStrings.ur]
    
    @scala.inline
    def uz: typings.unsplashJs.unsplashJsStrings.uz = "uz".asInstanceOf[typings.unsplashJs.unsplashJsStrings.uz]
    
    @scala.inline
    def vi: typings.unsplashJs.unsplashJsStrings.vi = "vi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.vi]
    
    @scala.inline
    def xh: typings.unsplashJs.unsplashJsStrings.xh = "xh".asInstanceOf[typings.unsplashJs.unsplashJsStrings.xh]
    
    @scala.inline
    def yi: typings.unsplashJs.unsplashJsStrings.yi = "yi".asInstanceOf[typings.unsplashJs.unsplashJsStrings.yi]
    
    @scala.inline
    def yo: typings.unsplashJs.unsplashJsStrings.yo = "yo".asInstanceOf[typings.unsplashJs.unsplashJsStrings.yo]
    
    @scala.inline
    def zh: typings.unsplashJs.unsplashJsStrings.zh = "zh".asInstanceOf[typings.unsplashJs.unsplashJsStrings.zh]
    
    @scala.inline
    def `zh-TW`: typings.unsplashJs.unsplashJsStrings.`zh-TW` = "zh-TW".asInstanceOf[typings.unsplashJs.unsplashJsStrings.`zh-TW`]
    
    @scala.inline
    def zu: typings.unsplashJs.unsplashJsStrings.zu = "zu".asInstanceOf[typings.unsplashJs.unsplashJsStrings.zu]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.portrait
    - typings.unsplashJs.unsplashJsStrings.landscape
    - typings.unsplashJs.unsplashJsStrings.squareish
  */
  trait Orientation extends StObject
  object Orientation {
    
    @scala.inline
    def landscape: typings.unsplashJs.unsplashJsStrings.landscape = "landscape".asInstanceOf[typings.unsplashJs.unsplashJsStrings.landscape]
    
    @scala.inline
    def portrait: typings.unsplashJs.unsplashJsStrings.portrait = "portrait".asInstanceOf[typings.unsplashJs.unsplashJsStrings.portrait]
    
    @scala.inline
    def squareish: typings.unsplashJs.unsplashJsStrings.squareish = "squareish".asInstanceOf[typings.unsplashJs.unsplashJsStrings.squareish]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.latest
    - typings.unsplashJs.unsplashJsStrings.oldest
  */
  trait PhotoOrderBy extends StObject
  object PhotoOrderBy {
    
    @scala.inline
    def latest: typings.unsplashJs.unsplashJsStrings.latest = "latest".asInstanceOf[typings.unsplashJs.unsplashJsStrings.latest]
    
    @scala.inline
    def oldest: typings.unsplashJs.unsplashJsStrings.oldest = "oldest".asInstanceOf[typings.unsplashJs.unsplashJsStrings.oldest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.public
    - typings.unsplashJs.unsplashJsStrings.read_user
    - typings.unsplashJs.unsplashJsStrings.write_user
    - typings.unsplashJs.unsplashJsStrings.read_photos
    - typings.unsplashJs.unsplashJsStrings.write_photos
    - typings.unsplashJs.unsplashJsStrings.write_likes
    - typings.unsplashJs.unsplashJsStrings.write_followers
    - typings.unsplashJs.unsplashJsStrings.read_collections
    - typings.unsplashJs.unsplashJsStrings.write_collections
  */
  trait Scopes extends StObject
  object Scopes {
    
    @scala.inline
    def public: typings.unsplashJs.unsplashJsStrings.public = "public".asInstanceOf[typings.unsplashJs.unsplashJsStrings.public]
    
    @scala.inline
    def read_collections: typings.unsplashJs.unsplashJsStrings.read_collections = "read_collections".asInstanceOf[typings.unsplashJs.unsplashJsStrings.read_collections]
    
    @scala.inline
    def read_photos: typings.unsplashJs.unsplashJsStrings.read_photos = "read_photos".asInstanceOf[typings.unsplashJs.unsplashJsStrings.read_photos]
    
    @scala.inline
    def read_user: typings.unsplashJs.unsplashJsStrings.read_user = "read_user".asInstanceOf[typings.unsplashJs.unsplashJsStrings.read_user]
    
    @scala.inline
    def write_collections: typings.unsplashJs.unsplashJsStrings.write_collections = "write_collections".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_collections]
    
    @scala.inline
    def write_followers: typings.unsplashJs.unsplashJsStrings.write_followers = "write_followers".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_followers]
    
    @scala.inline
    def write_likes: typings.unsplashJs.unsplashJsStrings.write_likes = "write_likes".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_likes]
    
    @scala.inline
    def write_photos: typings.unsplashJs.unsplashJsStrings.write_photos = "write_photos".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_photos]
    
    @scala.inline
    def write_user: typings.unsplashJs.unsplashJsStrings.write_user = "write_user".asInstanceOf[typings.unsplashJs.unsplashJsStrings.write_user]
  }
  
  @js.native
  trait Unsplash extends StObject {
    
    var auth: Auth = js.native
    
    var collections: Collections = js.native
    
    var currentUser: CurrentUser = js.native
    
    var photos: Photo = js.native
    
    def request(requestOptions: Body): js.Promise[Response] = js.native
    
    var search: Search = js.native
    
    var stats: Stats = js.native
    
    var users: Users = js.native
  }
  object Unsplash {
    
    @scala.inline
    def apply(
      auth: Auth,
      collections: Collections,
      currentUser: CurrentUser,
      photos: Photo,
      request: Body => js.Promise[Response],
      search: Search,
      stats: Stats,
      users: Users
    ): Unsplash = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unsplash]
    }
    
    @scala.inline
    implicit class UnsplashMutableBuilder[Self <: Unsplash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollections(value: Collections): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUser(value: CurrentUser): Self = StObject.set(x, "currentUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: Photo): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Body => js.Promise[Response]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  object UnsplashApi {
    
    @js.native
    trait Auth extends StObject {
      
      def getAuthenticationUrl(): String = js.native
      def getAuthenticationUrl(scopes: js.Array[Scopes]): String = js.native
      
      def setBearerToken(accessToken: String): Unit = js.native
      
      def userAuthentication(code: String): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Collections extends StObject {
      
      def addPhotoToCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
      
      def createCollection(title: String): js.Promise[Response] = js.native
      def createCollection(title: String, description: js.UndefOr[scala.Nothing], isPrivate: Boolean): js.Promise[Response] = js.native
      def createCollection(title: String, description: String): js.Promise[Response] = js.native
      def createCollection(title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      
      def deleteCollection(id: Double): js.Promise[Response] = js.native
      
      def getCollection(id: Double): js.Promise[Response] = js.native
      
      def getCollectionPhotos(id: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      
      def listCollections(): js.Promise[Response] = js.native
      def listCollections(page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def listCollections(page: Double): js.Promise[Response] = js.native
      def listCollections(page: Double, perPage: Double): js.Promise[Response] = js.native
      
      def listRelatedCollections(collectionId: Double): js.Promise[Response] = js.native
      
      def removePhotoFromCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
      
      def updateCollection(id: Double): js.Promise[Response] = js.native
      def updateCollection(
        id: Double,
        title: js.UndefOr[scala.Nothing],
        description: js.UndefOr[scala.Nothing],
        isPrivate: Boolean
      ): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: js.UndefOr[scala.Nothing], description: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: js.UndefOr[scala.Nothing], description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: js.UndefOr[scala.Nothing], isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
    }
    
    @js.native
    trait CurrentUser extends StObject {
      
      def profile(): js.Promise[Response] = js.native
      
      def updateProfile(options: Bio): js.Promise[Response] = js.native
    }
    object CurrentUser {
      
      @scala.inline
      def apply(profile: () => js.Promise[Response], updateProfile: Bio => js.Promise[Response]): CurrentUser = {
        val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile), updateProfile = js.Any.fromFunction1(updateProfile))
        __obj.asInstanceOf[CurrentUser]
      }
      
      @scala.inline
      implicit class CurrentUserMutableBuilder[Self <: CurrentUser] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProfile(value: () => js.Promise[Response]): Self = StObject.set(x, "profile", js.Any.fromFunction0(value))
        
        @scala.inline
        def setUpdateProfile(value: Bio => js.Promise[Response]): Self = StObject.set(x, "updateProfile", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Photo extends StObject {
      
      def downloadPhoto(photo: Links): js.Promise[Response] = js.native
      
      def getPhoto(id: String): js.Promise[Response] = js.native
      
      def getPhotoStats(id: String): js.Promise[Response] = js.native
      
      def getRandomPhoto(options: C): js.Promise[Response] = js.native
      
      def likePhoto(id: String): js.Promise[Response] = js.native
      
      def listPhotos(): js.Promise[Response] = js.native
      def listPhotos(page: js.UndefOr[scala.Nothing], perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def listPhotos(page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Double): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Double): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      
      def trackDownload(photo: Links): js.Promise[Response] = js.native
      
      def unlikePhoto(id: String): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Search extends StObject {
      
      def collections(keyword: String): js.Promise[Response] = js.native
      def collections(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def collections(keyword: String, page: Double): js.Promise[Response] = js.native
      def collections(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      
      def photos(keyword: String): js.Promise[Response] = js.native
      def photos(
        keyword: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        filters: typings.unsplashJs.anon.Collections
      ): js.Promise[Response] = js.native
      def photos(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def photos(
        keyword: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        filters: typings.unsplashJs.anon.Collections
      ): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double): js.Promise[Response] = js.native
      def photos(
        keyword: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        filters: typings.unsplashJs.anon.Collections
      ): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Double, filters: typings.unsplashJs.anon.Collections): js.Promise[Response] = js.native
      
      def users(keyword: String): js.Promise[Response] = js.native
      def users(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def users(keyword: String, page: Double): js.Promise[Response] = js.native
      def users(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Stats extends StObject {
      
      def total(): js.Promise[Response] = js.native
    }
    object Stats {
      
      @scala.inline
      def apply(total: () => js.Promise[Response]): Stats = {
        val __obj = js.Dynamic.literal(total = js.Any.fromFunction0(total))
        __obj.asInstanceOf[Stats]
      }
      
      @scala.inline
      implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTotal(value: () => js.Promise[Response]): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Users extends StObject {
      
      def collections(username: String): js.Promise[Response] = js.native
      def collections(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: String
      ): js.Promise[Response] = js.native
      def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
      
      def likes(username: String): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy
      ): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      
      def photos(username: String): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy
      ): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typings.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      
      def profile(username: String): js.Promise[Response] = js.native
      
      def statistics(username: String): js.Promise[Response] = js.native
      def statistics(username: String, resolution: js.UndefOr[scala.Nothing], quantity: Double): js.Promise[Response] = js.native
      @JSName("statistics")
      def statistics_days(username: String, resolution: days): js.Promise[Response] = js.native
      @JSName("statistics")
      def statistics_days(username: String, resolution: days, quantity: Double): js.Promise[Response] = js.native
    }
  }
}
