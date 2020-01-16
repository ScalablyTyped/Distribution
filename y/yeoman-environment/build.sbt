organization := "org.scalablytyped"
name := "yeoman-environment"
version := "2.3-dt-20190731Z-6d1160"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-5f6574",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-bb1a0c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9a5dda",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-50e1f3",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-6209fe",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-f89933",
  "org.scalablytyped" %%% "yeoman-generator" % "3.1-dt-20190731Z-0cd325")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        